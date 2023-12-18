import java.util.*;

public class Main {

    static final Random rnd = new Random();
    static final long LIMIT = 1880L;
    static final long RANGE = 7000L;
    static final int D = 365;
    static final int[] c = new int[27];
    static final int[][] s = new int[365][27];
    static final int[] ans = new int[365];
    static final int[] last = new int[27];
    static final Map<Integer, TreeSet<Integer>> lastMap = new HashMap<>();
    static final Map<Integer, RMQ> segMap = new HashMap<>();
    static int impCnt = 0;
    static final int ADVANCED_SPAN = 12;
    public static void main(String[] args) {
        long end = System.currentTimeMillis() + LIMIT;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 1; i <= 26; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 26; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= 26; i++) {
            lastMap.put(i, new TreeSet<>());
            lastMap.get(i).add(0);
            lastMap.get(i).add(D+1);
            RMQ seg = new RMQ(D);
            segMap.put(i, seg);
            for (int j = 0; j < D; j++) {
                seg.update(j, s[j][i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int[] tmpc = new int[27];
        for (int i = 0; i < D; i++) {
            int span = Math.min(ADVANCED_SPAN, D-i-1);
            int score = 0;
            for (int j = 1; j <= 26; j++) {
                int curSpan = i - last[j] + 1;
                tmpc[j] = c[j] * (curSpan + curSpan + span) * (span+1) / 2;
                score -= tmpc[j];
            }
            int max = score;
            int idx = 0;
            for (int j = 1; j <= 26; j++) {
                int tmp = score + s[i][j] +  tmpc[j] - segMap.get(j).query(i, i+span+1);
                if(max < tmp){
                    max = tmp;
                    idx = j;
                }
            }
            ans[i] = idx;
            last[idx] = i+1;
            lastMap.get(idx).add(i+1);
        }

        // greedy
        while(System.currentTimeMillis() < end){
            boolean change = false;
            for (int i = 0; i < D; i++) {
                int prei = ans[i];
                int idx = prei;
                int max = s[i][prei] + c[prei] * (i - lastMap.get(prei).lower(i+1) +1) * (lastMap.get(prei).higher(i+1) - i -1);
                for (int j = 1; j <= 26; j++) {
                    if(j == prei)continue;
                    int tmp = s[i][j] + c[j] * (i - lastMap.get(j).lower(i+1) +1) * (lastMap.get(j).higher(i+1) - i -1);
                    if(max < tmp){
                        idx = j;
                        max = tmp;
                    }
                }
                if(prei != idx){
                    ans[i] = idx;
                    lastMap.get(prei).remove(i+1);
                    lastMap.get(idx).add(i+1);
                    change = true;
                }
            }
            if(!change)break;
        }

        // yakinamashi
        int cnt = 0;
        double rate = 0;
        double line = 0;
        while (true) {
            long curTime = System.currentTimeMillis();
            if (end < curTime) {
                break;
            }
            rate = ((double)end - (double)curTime) / (double)LIMIT;
            line = rate * RANGE;

            for (int i = 0; i < 1000; i++) {
                cnt++;
                if(rnd.nextDouble() < 0.8){
                    // 2-swap
                    swapTwo(line, cnt);
                }else{
                    // random change
                   randomChange(line);
                }
            }

//            if(cnt % 1_000_000 == 0){
//              System.err.println("LOOP COUNT:" + cnt);
//              System.err.println("IMPROVE COUNT:" + impCnt);
//            }

        }

//    System.out.println("LOOP COUNT:" + cnt);
//      System.err.println("LOOP COUNT:" + cnt);
//      System.err.println("IMPROVE COUNT:" + impCnt);


        for (int i = 0; i < D; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    private static boolean swapTwo(double line, int cnt) {
        int d1 = cnt % (D-1);
        int d2 = rnd.nextInt(15) + d1 + 1;
        if(D <= d2) d2 = D-1;
        int t1 = ans[d1], t2 = ans[d2];
        if(t1 == t2 && d1 != 0) t1 = ans[--d1];
        if(t1 == t2 && d2 != D-1) t2 = ans[++d2];
        if(t1 == t2)return false;
        int preScore = calcScoreDiff(d1, t1) + calcScoreDiff(d2, t2);
        ans[d1] = t2; ans[d2] = t1;
        lastMap.get(t1).remove(d1+1);
        lastMap.get(t2).remove(d2+1);
        lastMap.get(t1).add(d2+1);
        lastMap.get(t2).add(d1+1);
        int tryScore = calcScoreDiff(d1, t2) + calcScoreDiff(d2, t1);
        if(preScore < tryScore || preScore - tryScore < line){
            lastMap.get(t1).remove(d1+1);
            lastMap.get(t2).remove(d2+1);
            lastMap.get(t1).add(d2+1);
            lastMap.get(t2).add(d1+1);
            impCnt++;
            return true;
        }else{
            ans[d1] = t1; ans[d2] = t2;
            lastMap.get(t1).remove(d2+1);
            lastMap.get(t2).remove(d1+1);
            lastMap.get(t1).add(d1+1);
            lastMap.get(t2).add(d2+1);
        }
        return false;
    }

    private static boolean randomChange(double line) {
        int day = (int)(rnd.nextDouble() * D);
        int type = rnd.nextInt(26)+1;
        int preType = ans[day];
        if(preType == type) return false;
        int preScore = calcScoreDiff(day, preType);
        int tryScore = calcScoreDiff(day, type);
        if(preScore < tryScore || preScore - tryScore < line){
            ans[day] = type;
            lastMap.get(preType).remove(day+1);
            lastMap.get(type).add(day+1);
            impCnt++;
            return true;
        }
        return false;
    }

    private static int calcScoreDiff(int day, int type){
        return s[day][type] + c[type] * (day - lastMap.get(type).lower(day+1) +1) * (lastMap.get(type).higher(day+1) - day -1);
    }

}

class RMQ {

    public int n;
    public int size;
    public int[] data;

    /**
     * コンストラクタ.
     * @param n 要素数
     */
    public RMQ(int n){
        this.n = n;
        size = 1;
        while(size < n) size *= 2;
        data = new int[size*2];
        for (int i = 0; i < size*2; i++) data[i] = Integer.MIN_VALUE;
    }

    /**
     * k番目（0-indexed）の要素をaに更新します.
     * @param k 変更対象要素のindex（0-indexed）
     * @param a 変更後の値
     */
    public void update(int k, int a){
        k += size - 1;
        data[k] = a;
        while(0 < k){
            k = (k - 1) / 2;
            data[k] = Math.max(data[k * 2 + 1], data[k * 2 + 2]);
        }
    }

    /**
     * 区間[a, b)での最小値を求めます.
     * 最初に呼ぶ際は、query(a, b, 0, 0, size)として呼ぶ.
     * @param a 求める区間の下限（含む）
     * @param b 求める区間の上限（含まない）
     * @param k 確認するノードのindex
     * @param l 確認するノードの下限（含む）
     * @param r 確認するノードの上限（含まない）
     * @return 区間[a, b)での最小値
     */
    private int query(int a, int b, int k, int l, int r){
        if(r <= a || b <= l) return Integer.MIN_VALUE;

        if(a <= l && r <= b) return data[k];

        int vl = query(a, b, k*2+1, l, (l+r)/2);
        int vr = query(a, b, k*2+2, (l+r)/2, r);
        return Math.max(vl, vr);
    }

    public int query(int a, int b){
        return query(a, b, 0, 0, size);
    }
}

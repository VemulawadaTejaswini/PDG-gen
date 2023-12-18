import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        int[] c = new int[n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        ArrayList[] ql = new ArrayList[n+1];
        ArrayList[] qid = new ArrayList[n+1];
        for (int i = 0; i < Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(ql[r] == null) ql[r] = new ArrayList<>();
            ql[r].add(l);
            if(qid[r] == null) qid[r] = new ArrayList<>();
            qid[r].add(i);
        }
        int[] ans = new int[Q];
        BIT bit = new BIT(n+1);
        int[] idx = new int[n+1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(0 < idx[c[i]]){
                bit.add(idx[c[i]], -1);
            }else{
                sum++;
            }
            bit.add(i, 1);
            idx[c[i]] = i;
            if(qid[i] == null) continue;
            for (int j = 0; j < qid[i].size(); j++) {
                int l = (Integer)ql[i].get(j);
                int id = (Integer)qid[i].get(j);
                ans[id] = sum - bit.sum(l-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            sb.append(ans[i] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

class BIT {

    public int n;
    public int[] bit;

    public BIT(int n){
        this.n = n;
        bit = new int[n+1];
    }

    public int sum(int i){
        int s = 0;
        while(0 < i){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x){
        while(i <= n){
            bit[i] += x;
            i += i & -i;
        }
    }

    public int lowerBound(int k){
        if(k <= 0) return 0;
        int x = 0;
        int max = 1;
        while(max < n) max *= 2;
        for (int i = max; i > 0; i /= 2) {
            if(x + i <= n && bit[x + i] < k){
                k -= bit[x + i];
                x += i;
            }
        }
        return x + 1;
    }

}

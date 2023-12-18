import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[][]hc = new int[h][2];
        int[][] wc = new int[w][2];
        for (int i = 0; i < h; i++) {
            hc[i][1] = i;
        }
        for (int i = 0; i < w; i++) {
            wc[i][1] = i;
        }
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            hc[x][0]++; wc[y][0]++;
            set.add(x*1000000L + y);
        }
        Arrays.sort(hc, (x,y) -> y[0] - x[0]);
        Arrays.sort(wc, (x,y) -> y[0] - x[0]);
        int hmax = hc[0][0], wmax = wc[0][0];
        boolean alldup = true;
        for (int i = 0; i < h; i++) {
            if(hc[i][0] < hmax) break;
            for (int j = 0; j < w; j++) {
                if(wc[j][0] < wmax) break;
                long n = hc[i][1] * 1000000L + wc[j][1];
                if(!set.contains(n)){
                    alldup = false;
                    break;
                }
                if(!alldup) break;
            }
        }
        int ans = hmax + wmax - 1;
        if(!alldup) ans++;
        System.out.println(ans);
        sc.close();

    }

}

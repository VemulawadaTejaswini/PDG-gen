import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] array = new int[n][m];
        int[] cost = new int[n];
        int[] sum = new int[m];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
                sum[j] += array[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            if (sum[i] < x) {
                System.out.println(- 1);
                return;
            }
        }
        long ans = Long.MAX_VALUE;
        int limit = (int) Math.pow(2, n);
        parent : for (int i = 1; i < limit; i++) {
            int v = i;
            int[] target = new int[m];
            int index;
            long costSum = 0;
            while ((index = Integer.lowestOneBit(v)) > 0) {
                int t = (int)(Math.log(index) / Math.log(2));
                costSum += cost[t];
                for (int j = 0; j < m; j++) {
                    target[j] += array[t][j];
                }
                v -= index;
            }
            for (int j = 0; j < m; j++) {
                if (target[j] < x) {
                    continue parent;
                }
            }
            ans = Math.min(costSum, ans);
        }
        System.out.println(ans);
    }
}
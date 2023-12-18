import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] c = new int[m];
        boolean[] u = new boolean[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            for (int j = 0; j < b[i]; j++) {
                int t = sc.nextInt()-1;
                c[i] = c[i] | (1 << t);
                u[t] = true;
            }
        }
        boolean able = true;
        for (int i = 0; i < n; i++) {
            if(!u[i]) {
                able = false;
                break;
            }
        }
        if(able){
            int max = 1 << n;
            int[] dp = new int[max];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < max; j++) {
                    if((j & c[i]) == c[i] || dp[j] == Integer.MAX_VALUE)
                        continue;
                    int next = j | c[i];
                    if(dp[j] + a[i] < dp[next]) dp[next] = dp[j] + a[i];
                }
            }
            System.out.println(dp[max-1]);
        }else{
            System.out.println(-1);
        }
        sc.close();

    }

}

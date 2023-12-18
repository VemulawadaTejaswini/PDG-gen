import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = -1;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while(l + 1 < r){
                int m = (l+r) / 2;
                if(dp[m] < a[i]) l = m;
                else r = m;
            }
            dp[l+1] = a[i];
            if(ans < l+1) ans = l+1;
        }
        System.out.println(ans);
        sc.close();

    }

}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int [] hi = new int[N];

        for (int i = 0; i < N; i++) {

            hi[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int[] dp = new int[100000+1];

        //dp[i+2] = Math.min(Math.abs(hi[i+1] - hi[i]) + Math.abs(hi[i+2] - hi[i+1]), Math.abs(hi[i+2] - hi[i])) )
        dp[0] = 0;
        dp[1] = Math.abs(hi[1] - hi[0]);

        if(N == 2) {

        	System.out.println(dp[1]);
        	System.exit(0);
        }
        dp[2] = Math.min(Math.abs(hi[2] - hi[1]) + Math.abs(hi[1] - hi[0]), Math.abs(hi[2] - hi[0]));

        if(N == 3) {

        	System.out.println(dp[2]);
        	System.exit(0);
        }
        dp[3] = Math.min(Math.abs(hi[3] - hi[1]) + Math.abs(hi[1] - hi[0]), Math.abs(hi[2] - hi[0]) + Math.abs(hi[3] - hi[2]) );

        if(N == 4) {

        	System.out.println(dp[3]);
        	System.exit(0);
        }
//        dp[4] = Math.min(dp[2] + Math.abs(hi[4] - hi[2]), dp[3] + Math.abs(hi[4] - hi[3]));

        for (int i = 4; i < N; i++) {

            dp[i] = Math.min(dp[i-2] + Math.abs(hi[i] - hi[i-2]), dp[i-1] + Math.abs(hi[i] - hi[i-1]));
        }

        System.out.println(dp[N-1]);
    }

}
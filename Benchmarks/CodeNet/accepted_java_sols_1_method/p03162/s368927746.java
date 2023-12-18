import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.valueOf(br.readLine());
            // int[][] arr = new int[N][3];

            int[] dp = new int[3];
            for (int i = 0; i < N; i++) {
                String[] tmp = br.readLine().split(" ");
                int a = Integer.valueOf(tmp[0]), b = Integer.valueOf(tmp[1]), c = Integer.valueOf(tmp[2]);
                if (i == 0) {
                    dp[0] = a;
                    dp[1] = b;
                    dp[2] = c;
                } else {
                    int x = a + Math.max(dp[1], dp[2]);
                    int y = b + Math.max(dp[0], dp[2]);
                    int z = c + Math.max(dp[0], dp[1]);
                    dp[0] = x;
                    dp[1] = y;
                    dp[2] = z;
                }
            }

            int res = Math.max(dp[0], Math.max(dp[1], dp[2]));
            System.out.println(res);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
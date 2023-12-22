import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] tmp = br.readLine().split(" ");
            int N = Integer.valueOf(tmp[0]), K = Integer.valueOf(tmp[1]);

            tmp = br.readLine().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.valueOf(tmp[i]);
            }

            int[] dp = new int[N];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < Math.min(N, i + K + 1); j++) {
                    dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[j] - arr[i]));
                }
            }

            System.out.println(dp[N- 1]);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
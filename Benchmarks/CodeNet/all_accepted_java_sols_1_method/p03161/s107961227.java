import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String[] input_str_array = br.readLine().split(" ");
        int[] input_array = new int[N];

        for(int i = 0; i < N; i++) {
            input_array[i] = Integer.parseInt(input_str_array[i]);
        }

        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        // dp[1] = Math.abs(input_array[0] - input_array[1]);

        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= K; j++) {
                if(i+j > N-1) break;
                if(dp[i + j] == -1) {
                    dp[i + j] = Math.abs(input_array[i] - input_array[i + j]) + dp[i];
                } else {
                    dp[i + j] = Math.min(Math.abs(input_array[i] - input_array[i + j]) + dp[i], dp[i + j]);
                }
                
            }
        }
        
        pw.println(dp[N-1]);
        pw.close();
        br.close();
    }
}

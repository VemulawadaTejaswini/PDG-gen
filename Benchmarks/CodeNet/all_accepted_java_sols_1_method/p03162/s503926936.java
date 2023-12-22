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

        int[][] dp = new int[N][3];
        String[] first_input_str_array = br.readLine().split(" ");
        dp[0][0] = Integer.parseInt(first_input_str_array[0]);
        dp[0][1] = Integer.parseInt(first_input_str_array[1]);
        dp[0][2] = Integer.parseInt(first_input_str_array[2]);

        for(int i = 1; i < N; i++) {

            String[] input_str_array = br.readLine().split(" ");
            
            for(int j = 0; j < 3; j++) {

                for(int k = 0; k < 3; k++) {

                    if(j == k) continue;
                    dp[i][k] = Math.max(dp[i-1][j] + Integer.parseInt(input_str_array[k]), dp[i][k]);

                }
            }
        }

        int[] ans_array = dp[N-1];
        Arrays.sort(ans_array);
        
        pw.println(ans_array[2]);
        pw.close();
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int cut = 1000000000 + 7;

        int[] dp = new int[S+10];
        dp[0] = 1;

        for(int i = 1; i <= S; i++) {
            for(int j = 0; j < i - 3 + 1; j++) {
                dp[i] += dp[j];
                dp[i] %= cut;
            }
        }
        
        pw.println(dp[S]);
        br.close();
        pw.close();
    }
}
import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] strH = br.readLine().split(" ");
        int[] H = Stream.of(strH).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[N]; 
        dp[0] = 0;
        
        int maxValue = 0;
        
        for(int i = 1; i < N; i++){
            if(H[i-1] >= H[i]){
                dp[i] = dp[i-1] + 1;
                maxValue = Math.max(maxValue, dp[i]);
            } else {
                dp[i] = 0;
            }
        }
        
        System.out.println(maxValue);
    }
}

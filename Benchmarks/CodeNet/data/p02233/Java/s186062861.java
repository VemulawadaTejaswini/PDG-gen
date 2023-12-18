import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static int[] dp = new int[50];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i <= n; i++) dp[i] = -1;
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return dp[n] = 1;
        }
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib(n-1) + fib(n-2);
    }
}
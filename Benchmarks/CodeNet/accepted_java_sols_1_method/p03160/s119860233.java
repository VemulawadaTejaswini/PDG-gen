import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String []s = br.readLine().split(" ");
        int []h = new int[N];
        for(int i=0; i < N; ++i)
            h[i] = Integer.parseInt(s[i]);

        int []dp = new int[N];

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for(int i=2; i < N; ++i)
            dp[i] = Math.min(
                dp[i-1] + Math.abs(h[i] - h[i-1]),
                dp[i-2] + Math.abs(h[i] - h[i-2])
                );

        System.out.println(dp[N-1]);
    }
}
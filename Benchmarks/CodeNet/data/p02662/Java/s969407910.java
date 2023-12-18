import java.io.*;
import java.util.*;

public class Main {
    private static int MOD = 998244353;
    private static int add(int a, int b) {
        a += b;
        while (a >= MOD) a -= MOD;
        while (a < 0) a += MOD;
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer sti = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(sti.nextToken());
        }
        int[] dp  = new int[S + 1];
        dp[0] = 1;
        for (int i = 0; i < N; ++i) {
            int[] temp = new int[dp.length];
            for (int j = 0; j <= S; ++j) {
                temp[j] = add(dp[j], dp[j]);
                if (j - arr[i] >= 0) {
                    temp[j] = add(temp[j], dp[j - arr[i]]);
                }
            }
            dp = temp;
            //  0 1 2 3
            //0 1 0 0 0 
            //1 2 1 0 0
            //2 4 2 2 1
            //3 8 4 4 6
        }
        System.out.println(dp[S]);
    }
}
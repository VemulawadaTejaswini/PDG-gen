import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int N =sc.nextInt(), K = sc.nextInt();
        long R = sc.nextLong(), S = sc.nextLong(), P = sc.nextLong();
        char[] T = sc.next().toCharArray();
        // dp[i][j]: at the i-th round Taka uses j (0,1,2) and the max score
        // j: 0-rock, 1-scissor, 2:paper
        long[][] dp = new long[N][3];
        int[] charMap = new int[256], loseTo = new int[256];
        charMap['r'] = 0; charMap['s'] = 1; charMap['p'] = 2;
        loseTo['r'] = 2; loseTo['s'] = 0; loseTo['p'] = 1;
        HashMap<Integer,Long> map = new HashMap<>(3);
        map.put(0,R); map.put(1,S); map.put(2,P);
        // should have discuss base on result of i%N
        // then turns to problem of K = 1
        for(int remainder = 0; remainder < K; remainder ++){
            int winner = loseTo[T[remainder]];
            dp[remainder][winner] = map.get(winner);
            for(int i=remainder+K; i<N; i+= K){
                winner = loseTo[T[i]];
                for(int j=0;j<3;j++){
                    // and i'th round use j
                    long base = j==winner?map.get(winner):0;
                    long maxVal = 0;
                    for(int k=0;k<3;k++){
                        if(k==j) continue; // can't have two consecutive
                        maxVal = Math.max(maxVal, dp[i-K][k]);
                    }
                    dp[i][j] = base + maxVal;
                }
            }
        }
        long ans = 0;
        for(int i=N-1;i>=N-K;i--){
            long maxVal = 0;
            for(int j=0;j<3;j++) maxVal = Math.max(maxVal, dp[i][j]);
            ans += maxVal;
        }
        System.out.println(ans);
    }
}


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int N = in.nextInt();
        int K = in.nextInt();
        boolean[] dp = new boolean[K+1];
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        

        for(int stones = 1; stones <= K; stones++) {
           for(int x : a) {
               if(stones >= x && !dp[stones-x]) {
                   dp[stones] = true;
               }
           }
        }
        
        System.out.println(dp[K] == true ? "First" : "Second");
    }
        
}

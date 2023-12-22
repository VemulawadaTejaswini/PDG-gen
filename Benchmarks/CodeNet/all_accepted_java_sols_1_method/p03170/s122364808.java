import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] nk = reader.readLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        String[] lo = reader.readLine().split(" ");
        int[] list = new int[N];
        for (int i = 0; i <N ; i++) {
            list[i] = Integer.parseInt(lo[i]);
        }
        int[] dp = new int[K+1];
        dp[0] = 0;
        for (int i = 0; i <=K ; i++) {
            boolean possible = false;
            for (int j = 0; j<N && list[j] <= i ; j++) {
                if(dp[i-list[j]]==0){
                    possible=true;
                    dp[i] = 1;
                    break;
                }
            }
            if(!possible) dp[i]=0;
        }
        if(dp[K]==1) System.out.println("First");
        else System.out.println("Second");
    }
}

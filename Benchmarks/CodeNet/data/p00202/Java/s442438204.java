import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<=1000000; i++){
            if(isPrime[i]) {
                for(int j=i*2; j<=1000000; j+=i){
                    isPrime[j] = false;
                } 
            }
        }
        
        while(true){
            int N = sc.nextInt();
            int x = sc.nextInt();
            if(N==0 && x==0) break;
            
            int[] p = new int[N+1];
            for(int i=0; i<N;i++){
                p[i] = sc.nextInt();
            }
            
            boolean[] dp = new boolean[x+1];
            dp[0]=true;
            for(int i=0; i<N; i++){
                for(int j=0; j<=x-p[i]; j++){
                    dp[j+p[i]] = dp[j] || dp[j+p[i]];
                    
                }
            }
            int ans = 0;
            for(int i=x; i>0; i--){
                if(isPrime[i] && dp[i]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans==0 ? "NA" : ans);
            
        }
    }
}

	    
	    
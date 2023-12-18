import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i*i < 1000000; i++){
            if(isPrime[i]){
                for(int ii = i+i; ii < 1000000; ii+=i){
                    isPrime[ii] = false;
                }
            }
        }
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n==0 && x==0){
                break;
            }
            int price[] = new int[n];
            for(int i = 0; i < n; i++){
                price[i] = sc.nextInt();
            }
            boolean[] dp = new boolean[x+1];
            dp[0] = true;
            for(int p: price){
                for(int i = 0; i <= x-p; i++){
                    dp[i+p] = dp[i] || dp[i+p];
                }
            }
            int ans = 0;
            for(int i = x; i > 0; i--){
                if(dp[i] && isPrime[i]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans==0 ? "NA" : ans);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}
    
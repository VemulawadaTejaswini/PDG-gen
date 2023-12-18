import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] dp;
    static int n, x;
    static int[] value;
    static boolean[] prime;
    public static void main(String[] args) {
        makePrime();
        while(read()){
            solve();
        }

    }

    static void makePrime(){
        prime = new boolean[1000001];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < prime.length; i++){
            if(prime[i]){
                for(int j = i*2; j < prime.length; j += i)prime[j] = false;
            }
        }
    }

    static boolean read(){
        n = sc.nextInt();
        x = sc.nextInt();
        if( n == 0 && x == 0)return false;

        dp = new int[x+1];
        value = new int[n];

        for(int i = 0; i < value.length; i++){
            value[i] = sc.nextInt();
        }

        return true;
    }

    static void solve(){
        boolean f = false;
        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = value[i]; j <= x; j++){

                dp[j] = Math.max(dp[j], dp[j - value[i]] + value[i] );

                int k = dp[j];
                if(prime[k]){
                    max = k;
                    f = true;
                }

            }
        }

        if(f){
            System.out.println(max);
        }else{
            System.out.println("NA");
        }

    }
}
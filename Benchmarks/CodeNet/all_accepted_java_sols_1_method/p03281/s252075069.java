import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= N; i++){
            if(isPrime[i]){
                for(int j = i*2; j <= N; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        int ans = 0;
        for(int i = 1; i <= N; i+=2){
            int[] primes = new int[N+1];
            for(int j = 2; j <= N; j++){
                if(isPrime[j]){
                    int target = i;
                    while( target % j== 0 ){
                        target /= j;
                        primes[j]++;
                    }
                }
            }
            
            int cnt = 1;
            for(int j = 2; j <= N; j++){
                if( primes[j] > 0 ) cnt *= (primes[j]+1);
            }
            if(cnt == 8) ans++;
        }
        
        System.out.println(ans);
        
    }
}

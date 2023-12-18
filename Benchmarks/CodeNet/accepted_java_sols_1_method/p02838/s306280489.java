import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        long[] A = new long[N];
        long mod = 1000000007;

        for(int i=0; i<N; i++){
            A[i] = sc.nextLong();
        }
        long ans = 0;
        for(int i=0; i<60; i++){
            long c = 0;
            for(int j=0; j<N; j++){
                if(((A[j]>>>i) & 1)==1){
                    c += 1;
                }
            }
            long d = (c * (N - c)) % mod;
            for(int j=0; j<i; j++){
                d = (d<<1) % mod;
            }
            ans += d;
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}
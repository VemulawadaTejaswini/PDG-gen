import java.util.*;

class Main{
    public static final long MOD = 1000000007;

    public Main(){
         Scanner S =  new Scanner(System.in);
         long N = Long.parseLong(S.next());
         long K = Long.parseLong(S.next());

         long min,max;
         min = (K-1)*K/2 % MOD;
         max = (2*N-K+1)*K/2 % MOD;
         long total = (max - min + 1) % MOD;
         if(total < 0) total += MOD;
         long temp;
         for(long i=K+1;i<=N+1;i++){
             min = (min + i-1) % MOD;
             max = (max + N-i+1) % MOD;
             temp = (max - min + 1) % MOD;
             if(temp<0) temp += MOD;
             total = (total + temp) % MOD;
             if(total<0) total += MOD;
         }

         System.out.println(total);
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}

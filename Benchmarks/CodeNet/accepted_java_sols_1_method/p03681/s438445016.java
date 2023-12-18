import java.util.*;
 
public class Main{
    static int mod = 1000000007;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        long[] kaijou = new long[Math.max(N, M)];
        kaijou[0] = 1;
        for(int i = 1; i < kaijou.length; i++){
            kaijou[i] = kaijou[i-1]*(i+1) % mod;
        }

        if(Math.abs(N-M) >= 2)
            System.out.println(0);
        else if(Math.abs(N-M) == 1){
            System.out.println(kaijou[M-1]*kaijou[N-1]%mod);
        } else{
            System.out.println(kaijou[M-1]*kaijou[N-1]*2%mod);
        }
    }
    
}
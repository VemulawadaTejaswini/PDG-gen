
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long fact[] = new long[100001];
        fact[0]=1;
        for(int i=1;i<fact.length;i++)fact[i]=(i*fact[i-1])%MOD;
        long ans = 1;
        
        ans = fact[n]*fact[m];

        if(n==m){
            ans *= 2;
        }else if(Math.abs(n-m)==1){

        }else{
            ans = 0;
        }
        System.out.println(ans%MOD);

    }
}

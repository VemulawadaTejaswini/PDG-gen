import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static long MOD = 1000000007;

    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] fact = new long[n+1];
        fact[0]=1;
        for(int i=1;i<n+1;i++){
            fact[i]=i*fact[i-1]%MOD;
        }
        System.out.println(fact[n]);
    }
}



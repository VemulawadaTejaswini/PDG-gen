import java.util.*;


public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    static long modinv(long a, long m) {
        long b = m;
        long u = 1;
        long v = 0;
        while (b != 0) {
            long t = a / b;

            a -= t * b;
            long tmp = b;
            b = a;
            a = tmp;
            u -= t * v;
            tmp = v;
            v = u;
            u = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] doubleA = new long[N];
        long ans = 0;

        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
            doubleA[i]  = A[i] * A[i] % mod;
            ans += A[i];
            ans %= mod;
        }

        long doubleSum =0;
        for(int i=0;i<N;i++){
            doubleSum += doubleA[i];
            doubleSum %= mod;
        }
        ans = ((ans * ans) % mod - doubleSum % mod) % mod;
        ans = ans * modinv(2,mod) % mod;
        if(ans<0){
            ans+= mod;
        }

        System.out.println(ans);


    }

}



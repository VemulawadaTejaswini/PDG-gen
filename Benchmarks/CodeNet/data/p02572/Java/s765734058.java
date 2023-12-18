import java.util.*;


public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] doubleA = new long[N];
        long ans = 0;

        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
            doubleA[i]  = A[i] * A[i];
            ans += A[i];
        }

        long doubleSum =0;
        for(int i=0;i<N;i++){
            doubleSum += doubleA[i];
        }
        ans = (((ans * ans) - doubleSum) /2)% mod;
        if(ans < 0){
            ans += mod;
        }

        System.out.println(ans);


    }

}



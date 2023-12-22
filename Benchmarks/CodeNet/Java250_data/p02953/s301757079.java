import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        for(int i= 0;i<N;i++){
            H[i] = sc.nextInt();
        }
        boolean ans = true;
        for(int i = N-2;i >= 0;i--){
            if(H[i]-1 == H[i+1]){
                H[i]--;
            }else if(H[i+1]-H[i] < -1 ){
                ans = false;
            }
        }
        System.out.println(ans?"Yes":"No");
    }

    int gcd(int m, int n
    ) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}

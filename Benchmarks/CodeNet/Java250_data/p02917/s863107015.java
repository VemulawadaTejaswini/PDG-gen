import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] B = new long[(int)(N-1)];
        for(int i = 0 ; i < N-1 ; i++){
                B[i] = sc.nextLong();
        }
        solve(N, B);
    }

    static void solve(long N, long[] B){
        long ans = 0;
        ans += B[0];
        for (int i = 1; i < B.length; i++) {
            ans += Math.min(B[i], B[i-1]);
        }
        ans += B[B.length - 1];
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        int max_T = 0;
        for (int i=0;i<N;i++) {
            T[i] = sc.nextInt();
            max_T = Math.max(max_T, T[i]);
        }
        int max_A = 0;
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            max_A = Math.max(max_A, A[i]);
        }

        if (max_T!=max_A) {
            System.out.println(0);
            return;
        }
        int max_left = 0;
        int max_right = N-1;
        for (int i=0;i<N;i++) {
            if (T[i]==max_T) {
                max_left = i;
                break;
            }
        }
        for (int i=N-1;i>=0;i--) {
            if (A[i]==max_A) {
                max_right = i;
                break;
            }
        }
        if (max_right<max_left) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        int mod = 1_000_000_007;
        for (int i=0;i<max_left;i++) {
            if (i!=0 && T[i]==T[i-1]) {
                ans = ans*T[i]%mod;
            }
        }
        for (int i=N-1;i>=max_right+1;i--) {
            if (i!=N-1 && A[i]==A[i+1]) {
                ans = ans*A[i]%mod;
            }
        }
        for (int i=max_left+1;i<max_right;i++) {
            ans = ans*T[i]%mod;
        }
        // System.out.println("max_left, max_right: "+max_left+" "+max_right);
        System.out.println(ans);
    }
}

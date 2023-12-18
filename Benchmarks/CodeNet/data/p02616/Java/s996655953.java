import java.util.*;

public class Main {
    public static final long MOD = 1000000007;
    int N,K;
    long[] A;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        if (N == K){
            long R = 1;
            for (int i = 0; i < N; i++) {
                R = R * scanner.nextLong() % MOD;
                if(R < 0) R += MOD;
            }
            System.out.println(R);
            return;
        }

        A = new long[N];

        boolean allMinus = true;
        for (int i = 0; i < N; i++) {
            long in = scanner.nextLong();
            allMinus = allMinus && in < 0L;
            A[i] = in;
        }

        if(allMinus && (K & 1) == 1){
            allMinus();
        } else {
            searchMax();
        }
    }

    void searchMax(){
        Arrays.sort(A);

        long R = 1L;
        int max1 = N-1, max2 = N-2, min1 = 0, min2 = 1;

        while(K > 0){
            if(K == 1){
                R = R * A[max1] % MOD;
                break;
            }

            if(A[max1] * A[max2] > A[min1] * A[min2]){
                R = R * A[max1] % MOD;

                max1 = max2;
                max2 -= 1;
                K -= 1;
            } else {
                R = R * (A[min1] * A[min2] % MOD) % MOD;
                
                min1 += 2;
                min2 += 2;
                K -= 2;
            }
        }

        System.out.println(R);
    }

    void allMinus(){
        Arrays.sort(A);

        long R = 1L;
        for (int i = 0; i < K; i++) {
            R = R * A[N-1-i] % MOD;
            R += MOD;
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        new Main();
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    long[] A;
    long[] integ;
    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        A = new long[N];
        integ = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        int f = 1;
        long tmp1 = dp(0, K);
        for(int i = K - 1; i < N-1; i++) {
            long tmp2 = dp(f, K+f);
            f++;
            if(tmp1 < tmp2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            tmp1 = tmp2;
        }
    }

    private long dp(int i, int k) {
//        if(i > 0 && integ[i-1] != 0){
//            long tmp = integ[i-1] / A[i-1] * A[k-1];
//            integ[i] = tmp;
//            return tmp;
//        }

        long ret = 1;
        for(int j = i; j < k; j++) {
            ret *= A[j];
            if(ret == 0) break;
        }
        integ[i] = ret;
        return ret;

    }
}
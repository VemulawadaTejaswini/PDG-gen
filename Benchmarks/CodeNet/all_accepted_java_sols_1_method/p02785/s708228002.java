import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();
        long[] H = new long[N];
        for (int i = 0; i < N; i++) {
            H[i] = stdIn.nextLong();
        }
        stdIn.close();
        Arrays.sort(H);

        Long sum = (long)0;
        if (N < K) {
            System.out.println(0);
        } else if(K == 0) {
            for (int i = 0; i < N; i++) {
                sum += H[i];
            }
            System.out.println(sum);
        } else {
            for (int i = 0; i < K; i++) {
                H[N-1-i] = 0;
            }
            for (int i = 0; i < N; i++) {
                sum += H[i];
            }
            System.out.println(sum);
        }
    }
}
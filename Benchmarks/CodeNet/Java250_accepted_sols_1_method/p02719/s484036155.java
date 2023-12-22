import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long N;
        long K;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
            K = sc.nextLong();
        }
        if (N > K) {
            N = N % K;
        }
        if (K - N > N) {
            System.out.println(N);
        } else {
            System.out.println(K - N);
        }
    }
}

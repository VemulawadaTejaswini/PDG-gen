import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long K = sc.nextLong();

            long min = N;
            min = Math.min(min, N % K);
            min = Math.min(min, (N % K) + K);
            min = Math.min(min, Math.abs((N % K) - K));
            System.out.println(min);
        }
    }
}

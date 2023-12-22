
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long t = N % K;

        System.out.println(Math.min(t, K - t));
    }
}

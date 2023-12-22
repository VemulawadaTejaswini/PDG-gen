import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();

        long abs = Math.abs(N - K);
        if (abs > N) {
            System.out.println(N);
            return;
        }

        if (K > N) {
            System.out.println(Math.abs(N - K));
            return;
        }

        long div = N / K;
        long x = N - (K * div);
        abs = Math.abs(x - K);
        if (x > abs) {
            System.out.println(abs);
        } else {
            System.out.println(x);
        }
    }
}

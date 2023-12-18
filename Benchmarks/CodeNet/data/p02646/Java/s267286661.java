import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long V = sc.nextLong();
        final long B = sc.nextLong();
        final long W = sc.nextLong();
        final long T = sc.nextLong();

        for (int i = 0; i <= T; i++) {
            if (A + V * i >= B + W * i) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}

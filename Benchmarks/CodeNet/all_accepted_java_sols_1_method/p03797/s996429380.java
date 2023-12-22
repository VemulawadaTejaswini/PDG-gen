import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();

        if (m <= 2 * n) {
            System.out.println(Math.min(n,  m / 2));
        } else {
            System.out.println(n + (m - 2 * n) / 4);
        }

    }
}

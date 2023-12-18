import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long V = scanner.nextLong();
        long B = scanner.nextLong();
        long W = scanner.nextLong();
        long T = scanner.nextLong();
        scanner.close();

        if (W >= V) {
            System.out.println("NO");
            return;
        }

        if (Math.abs(A - B) <= T * (V - W)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        double K = (A + B) / 2d;

        if (K == (long) K) {
            System.out.println((long) K);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
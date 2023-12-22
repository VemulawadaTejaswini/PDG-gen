import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int D = in.nextInt();
            int N = in.nextInt();
            System.out.println((N == 100 ? 101 : N) * (D == 0 ? 1 : D == 1 ? 100 : 10000));
        }
    }
}

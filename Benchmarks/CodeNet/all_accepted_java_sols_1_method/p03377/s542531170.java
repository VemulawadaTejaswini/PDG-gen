import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int X = in.nextInt();

            X -= A;

            System.out.println(X >= 0 && B >= X ? "YES" : "NO");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = in.nextInt(), b = in.nextInt();
        System.out.printf("%d %d %.5f\n", a / b, a % b, ((double) a / b));
    }
}
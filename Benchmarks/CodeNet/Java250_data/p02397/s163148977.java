import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        for (int x = in.nextInt(), y = in.nextInt();
                x != 0 || y != 0;
                x = in.nextInt(), y = in.nextInt()) {
            int a = x < y ? x : y, b = x < y ? y : x;
            System.out.printf("%d %d\n", a, b);
        }
    }
}
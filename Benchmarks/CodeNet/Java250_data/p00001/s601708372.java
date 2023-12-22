import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 10; i++) {
            int h = in.nextInt();
            if (a < h) {
                c = b;
                b = a;
                a = h;
            } else if (b < h) {
                c = b;
                b = h;
            } else if (c < h) {
                c = h;
            }
        }
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
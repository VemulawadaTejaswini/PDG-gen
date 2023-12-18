import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (in.hasNext()) {
            int a = in.nextInt(), b = in.nextInt();
            int gcd = gcd(a, b);
            int lcm = a / gcd * b;
            System.out.println(gcd + " " + lcm);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
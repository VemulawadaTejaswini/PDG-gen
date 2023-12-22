import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        final double r = in.nextDouble();
        System.out.printf("%.5f %.5f\n", r * r * Math.PI, r * 2 * Math.PI);
        // System.out.printf("%f %f\n", r * r * Math.PI, r * 2 * Math.PI);
    }
}
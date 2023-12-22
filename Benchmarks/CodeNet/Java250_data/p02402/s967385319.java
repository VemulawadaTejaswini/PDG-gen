import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int n = in.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0;
        while (n-- > 0) {
            int x = in.nextInt();
            min = min < x ? min : x;
            max = max > x ? max : x;
            sum += x;
        }
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}
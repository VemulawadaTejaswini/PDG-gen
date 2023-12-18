import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int n = in.nextInt();
        int debt = 100000;
        double rate = 1.05;

        while (n --> 0) {
            debt *= rate;
            int rem = debt % 1000;
            if (rem != 0) {
                debt = debt - rem + 1000;
            }
        }

        System.out.println(debt);
    }
}
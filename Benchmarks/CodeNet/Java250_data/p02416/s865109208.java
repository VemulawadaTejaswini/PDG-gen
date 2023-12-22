import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        for (String x = in.next(); !x.equals("0"); x = in.next()) {
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += (x.charAt(i) - '0');
            }
            System.out.println(sum);
        }
    }
}
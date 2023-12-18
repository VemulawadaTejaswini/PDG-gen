import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        long a = Long.parseLong(sc.next());
        double b = Double.parseDouble(sc.next());
        System.out.println((long) (a * b));
    }
}

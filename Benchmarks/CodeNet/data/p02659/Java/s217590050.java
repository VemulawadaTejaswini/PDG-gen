import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner sc = new Scanner(System.in);
        String[] line = new String[2];
        line[0] = sc.next();
        line[1] = sc.next();
        long a = Long.parseLong(line[0]);
        double b = Double.parseDouble(line[1]);
        System.out.println((long) (a * b));
    }
}
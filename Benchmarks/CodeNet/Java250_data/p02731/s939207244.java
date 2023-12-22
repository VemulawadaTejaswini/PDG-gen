import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        double l = scanner.nextInt();


        double base = l / 3;

        double result = Math.pow(base, 3) ;

        System.out.println(result);
    }
}
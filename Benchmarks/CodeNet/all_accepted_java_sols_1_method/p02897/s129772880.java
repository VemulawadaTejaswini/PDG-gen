import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        scanner.close();

        int odd = (N + 1) / 2;
        double ans = (double) odd / N;

        System.out.println(ans);
    }
}

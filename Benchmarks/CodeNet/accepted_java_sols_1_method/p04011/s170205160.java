import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        int Y = Integer.parseInt(scanner.next());
        scanner.close();

        int sum = 0;
        if (N > K) {
            sum += K * X;
            sum += (N - K) * Y;
        } else {
            sum = N * X;
        }

        System.out.println(sum);
    }
}

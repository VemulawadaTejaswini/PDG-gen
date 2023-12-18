import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        int sum = 0;
        int count = 0;
        if (A >= K) {
            sum += K;
            System.out.println(sum);
            return;
        }
        sum += A;
        count += A;

        if (count + B >= K) {
            System.out.println(sum);
            return;
        }
        count += B;

        sum -= K - count;
        System.out.println(sum);
    }
}
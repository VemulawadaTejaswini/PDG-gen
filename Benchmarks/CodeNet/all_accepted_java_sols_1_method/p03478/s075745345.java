import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++) {
            int digit_sum = 0;
            int n = i;
            while (n>0) {
                digit_sum += n % 10;
                n /= 10;
            }
            if (A <= digit_sum && digit_sum <= B) {
                sum += i;
            }
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}
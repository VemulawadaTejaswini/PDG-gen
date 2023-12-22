import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long answer = 0;

        if (n < a) {
            answer = n;
        } else if (n <= a + b) {
            answer = a;
        } else if (n > a + b) {
            if (n % (a + b) == 0) {
                answer = a * (n / (a + b));
            } else if (n % (a + b) >= a) {
                answer = a * (n / (a + b)) + a;
            } else
            //(n%a+b<a)
            {
                answer = a * (n / (a + b)) + n % (a + b);
            }

        }
        System.out.println(answer);
    }
}

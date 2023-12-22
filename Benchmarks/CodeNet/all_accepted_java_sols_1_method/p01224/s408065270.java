import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i * i == n) {
                        sum += i;
                    }
                    else {
                        sum += i + n / i;
                    }
                }
            }
            sum -=  n;
            if (sum > n) {
                System.out.println("abundant number");
            }
            else if (sum < n) {
                System.out.println("deficient number");
            }
            else {
                System.out.println("perfect number");
            }
        }
        scanner.close();
    }
}


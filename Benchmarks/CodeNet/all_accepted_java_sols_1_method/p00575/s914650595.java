import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int n = c / (a * 7 + b), res = c % (a * 7 + b);
        int res_n = 0;
        if (res > a * 6) {
            res_n = 7;
        } else {
            res_n = (res % a == 0 ? res / a : res / a + 1);
        }

        System.out.println(n * 7 + res_n);
    }
}


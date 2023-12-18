import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int sum = 0;
        if (a < b) {
            sum = (x / 1000 + (x % 1000 > 0 ? 1 : 0)) * a;
        } else if (a > 2 * b) {
            sum = (x / 500 + (x % 500 > 0 ? 1 : 0)) * b;
        } else {
            sum += a * (x / 1000);
            x = x % 1000;
            if (x / 500 > 0 && x % 500 != 0) sum += a;
            else if (x > 0) sum += b;
        }
        System.out.println(sum);
    }
}

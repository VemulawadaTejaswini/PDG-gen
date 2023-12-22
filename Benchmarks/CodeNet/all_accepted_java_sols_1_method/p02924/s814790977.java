import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 0) {
            System.out.println((n - 1) / 2 * n + n / 2);
            return;
        }
        System.out.println(n / 2 * n);
    }

}


import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        int len = 0;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        while (n > 0) {
            ++len;
            n /= k;
        }
        System.out.println(len);
    }
}


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        n = n % k;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        long next = Math.abs(n - k);
        long min = n;
        while (n != next) {
            n = Math.abs(n - k);
            next = Math.abs(Math.abs(next - k) - k);
            min = Math.min(min, n);
        }
        System.out.println(min);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long length = a + b;
        long count = 0;
        if (length == 0 || a == 0) {
            System.out.println(0);
        } else {
            count += ((long) Math.floor(n / length)) * a;
            count += Math.min(n % length, a);
            System.out.println(count);

        }

    }
}
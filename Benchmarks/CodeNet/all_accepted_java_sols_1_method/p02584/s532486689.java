import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        long x = Math.abs(scanner.nextLong());
        long k = scanner.nextLong();
        long d = scanner.nextLong();

        long need = x / d;
        if (k <= need) {
            System.out.println(x - k * d);
            return;
        }
        k -= need;
        if (k % 2 == 1) {
            System.out.println(Math.min(Math.abs(x - (need + 1) * d), x - (need - 1) * d));
        } else {
            System.out.println(x - need * d);
        }
    }
}
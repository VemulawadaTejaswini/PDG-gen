import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long sum = 0;
        if (k <= a) {
            sum += 1 * k;
        } else if (k > a && k <= a + b) {
            sum += 1 * a;
        } else if (k > a + b) {
            sum += 1 * a - 1 * (k - a - b);
        }

        System.out.println(sum);
    }
}
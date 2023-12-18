import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long q = in.nextLong(), h = in.nextLong(), s = in.nextLong(), d = in.nextLong(), n = in.nextLong();
        long one = Math.min(Math.min(q * 4, h * 2), s);
        long a = n * one;
        long b = n / 2 * d + (n % 2 == 0 ? 0 : one);
        System.out.println(Math.min(a, b));
    }
}
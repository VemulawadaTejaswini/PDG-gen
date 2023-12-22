import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long s = scanner.nextLong();
        long diff = Integer.MAX_VALUE;
        for (long i = 1; i <= s; i *= 10) {
            diff = Math.min(diff, Math.abs(753 - s / i % 1000));
        }
        System.out.println(diff);
    }
}
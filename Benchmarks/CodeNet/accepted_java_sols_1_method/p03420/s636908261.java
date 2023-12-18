import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextInt(), k = scanner.nextInt();
        System.out.println(k == 0 ? n * n : LongStream.rangeClosed(k + 1, n).map(i -> (i - k) * (n / i) + Math.max(0, (n - n / i * i) - k + 1)).sum());
    }
}
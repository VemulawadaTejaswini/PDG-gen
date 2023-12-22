import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        TreeSet<Integer> divisors = new TreeSet<>();
        for (int i = 1; i * i <= m; i++) {
            if (m % i == 0) {
                divisors.add(i);
                divisors.add(m / i);
            }
        }
        System.out.println(m / divisors.ceiling(n));
    }
}
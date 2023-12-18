import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        for (long i = 2; i <= n; i++) {
            if (!isOK(n, i)) continue;
            count++;
            n /= i;
        }

        System.out.println(count);
    }

    private static boolean isOK(long n, long i) {
        if (n % i != 0) {
            return false;
        }

        Set<Long> set = new HashSet<>();
        for (long j = 2; j < i; j++) {
            if (i % j == 0) {
                set.add(j);
            }
        }
        if (set.size() > 2) {
            return false;
        }
        return true;
    }
}
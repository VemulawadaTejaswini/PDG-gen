import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Set<Long> set = new HashSet<>();
        for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                set.add((long) i);
                set.add(n / i);
            }
        }

        long ans = 0;
        for (Long num : set) {
            long cand = num - 1;
            if (cand > 0 && n / cand == n % cand) {
                ans += cand;
            }
        }

        System.out.println(ans);

    }

}

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        List<Long> divisor = divisor(n);
        long min = 1000000000001L;
        for (Long elm : divisor) {
            min = Math.min(min, elm + (n / elm));
        }

        long ans = min - 2;
        System.out.println(ans);
    }

    static List<Long> divisor(long n) {
        Set<Long> ret = new HashSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}

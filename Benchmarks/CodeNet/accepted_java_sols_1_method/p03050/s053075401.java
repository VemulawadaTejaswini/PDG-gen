import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long ans = 0;
        long i = 1;
        Set<Long> set = new HashSet<Long>();
        while (i * i <= N) {
            if (N % i == 0) {
                long g = N / i;
                set.add(i);
                set.add(g);
            }
            i++;
        }
        for (Long l : set) {
            l--;
            if (l == 0) {
                continue;
            }
            if (N % l == N / l) {
                ans += l;
            }

        }
        System.out.println(ans);
    }

}

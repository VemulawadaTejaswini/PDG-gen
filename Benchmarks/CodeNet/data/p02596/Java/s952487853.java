import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();

            HashSet<Long> used = new HashSet<Long>();
            long l7 = 7;
            for (int i = 1;;) {
                if (l7 % K == 0) {
                    System.out.println(i);
                    return;
                }
                if (l7 < K) {
                    l7 = l7 * 10 + 7;
                    i++;
                    if (!used.add(l7)) {
                        System.out.println(-1);
                        return;
                    }
                } else {
                    l7 %= K;
                }
            }
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            long N = Long.parseLong(sc.next());
            long tmp = N;

            int cnt = 0;
            for (int i = 2; i < N; i++) {
                if (tmp % i == 0) {
                    tmp /= i;
                    cnt++;
                }
                if (tmp <= i) break;
            }

            System.out.println(cnt);
        }
    }
}
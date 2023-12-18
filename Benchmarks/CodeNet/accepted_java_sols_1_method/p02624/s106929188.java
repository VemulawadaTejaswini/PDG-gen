import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            int[] q = new int[N+1];
            long ans = 0L;

            for (int i = 1; i <= N; i++) {
                for (int j = i; j <= N; j += i) {
                    ans += j;
                }
            }
            System.out.println(ans);
        }
    }
}
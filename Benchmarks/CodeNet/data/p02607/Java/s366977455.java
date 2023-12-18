import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(sc.next());
            }

            // Calc
            int cnt = 0;
            for (int i = 0; i < N; i += 2) {
                if (a[i] % 2 != 0) cnt++;
            }
            System.out.println(cnt);
        }
    }
}

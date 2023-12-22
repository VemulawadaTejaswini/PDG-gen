import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        if (K >= N) {
            System.out.println(0);
            return;
        }
        Integer[] H = new Integer[N];
        for (int i = 0; i < N; i++) {
            Integer hi = Integer.parseInt(sc.next());
            H[i] = hi;
        }
        Arrays.sort(H, Collections.reverseOrder());
        long sum = 0;
        for (int i = K; i < N; i++) {
            Integer hi = H[i];
            sum += hi;
        }
        System.out.println(sum);
    }
}

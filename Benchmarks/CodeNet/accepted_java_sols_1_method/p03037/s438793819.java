import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int L = Integer.MIN_VALUE;
        int R = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            L = Math.max(L, sc.nextInt());
            R = Math.min(R, sc.nextInt());
        }

        System.out.println(R >= L ? R - L + 1 : 0);
    }
}

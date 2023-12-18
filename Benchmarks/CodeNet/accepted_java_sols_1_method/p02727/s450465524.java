import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Integer[] p = new Integer[A];
        Integer[] q = new Integer[B];
        Integer[] r = new Integer[C];
        for (int i = 0; i < A; i++) p[i] = sc.nextInt();
        for (int i = 0; i < B; i++) q[i] = sc.nextInt();
        for (int i = 0; i < C; i++) r[i] = sc.nextInt();

        Arrays.sort(p, Collections.reverseOrder());
        Arrays.sort(q, Collections.reverseOrder());
        Arrays.sort(r, Collections.reverseOrder());
        Integer[] eat = new Integer[X + Y];
        for (int i = 0, j = 0, k = 0, xy = X + Y; i + j + k < xy;) {
            int a = 0, b = 0, c = 0;
            if (i != X) a = p[i];
            if (j != Y) b = q[j];
            if (k != C) c = r[k];
            if (a >= b && a >= c) eat[i + j + k] = p[i++];
            else if (b >= a && b >= c) eat[i + j + k] = q[j++];
            else eat[i + j + k] = r[k++];
        }
        long ans = 0;
        for (Integer i : eat) ans += i;
        System.out.println(ans);
    }
}

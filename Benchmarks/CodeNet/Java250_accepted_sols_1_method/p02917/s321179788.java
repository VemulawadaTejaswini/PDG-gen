import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        a[0] = b[0];
        for (int i = 1; i < n - 1; i++) {
            a[i] = Integer.min(b[i - 1], b[i]);
        }
        a[n - 1] = b[n - 2];
        System.out.println(IntStream.of(a).sum());
    }
}

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            b[i] = n - i;
        }

        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt() - 1;
            for (int j = 0; j <= p; j++) {
                b[j] += i;
            }
            for (int j = p; j < n; j++) {
                a[j] += i;
            }
        }

        Arrays.stream(a).forEach(System.out::println);
        Arrays.stream(b).forEach(System.out::println);
    }
}
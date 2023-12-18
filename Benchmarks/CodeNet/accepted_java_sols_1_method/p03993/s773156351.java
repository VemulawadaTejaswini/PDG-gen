import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            if (a[a[i]] == i) {
                count++;
            }
        }
        System.out.println(count / 2);
    }
}
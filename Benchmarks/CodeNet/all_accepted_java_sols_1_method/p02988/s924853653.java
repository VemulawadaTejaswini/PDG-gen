import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] p = new int[n];
        Arrays.setAll(p, i -> scanner.nextInt());
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((p[i - 1] < p[i] && p[i] < p[i + 1]) || p[i - 1] > p[i] && p[i] > p[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
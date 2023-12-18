import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] count = new int[3];
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            if (p <= a) {
                count[0]++;
            } else if (p <= b) {
                count[1]++;
            } else {
                count[2]++;
            }
        }
        System.out.println(Math.min(Math.min(count[0], count[1]), count[2]));
    }
}
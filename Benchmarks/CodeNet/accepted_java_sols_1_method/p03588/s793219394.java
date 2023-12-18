import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int maxA = 0, maxB = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (maxA < a) {
                maxA = a;
                maxB = b;
            }
        }
        System.out.println(maxA + maxB);
    }
}
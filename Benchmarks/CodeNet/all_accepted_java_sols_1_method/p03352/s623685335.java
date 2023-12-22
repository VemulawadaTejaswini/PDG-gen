import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int x = scanner.nextInt();
        int max = 1;
        for (int i = 2; i <= x; i++) {
            int j = i;
            while (true) {
                j *= i;
                if (j > x) {
                    break;
                }
                max = Math.max(max, j);
            }
        }
        System.out.println(max);
    }
}
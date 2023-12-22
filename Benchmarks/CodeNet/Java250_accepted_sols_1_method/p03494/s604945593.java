import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.min(max, Integer.numberOfTrailingZeros(scanner.nextInt()));
        }
        System.out.println(max);
    }
}
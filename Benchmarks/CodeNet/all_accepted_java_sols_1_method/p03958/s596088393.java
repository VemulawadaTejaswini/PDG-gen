import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < t; i++) {
            max = Math.max(max, scanner.nextInt());
        }
        System.out.println(Math.max(max - k + max - 1, 0));
    }
}
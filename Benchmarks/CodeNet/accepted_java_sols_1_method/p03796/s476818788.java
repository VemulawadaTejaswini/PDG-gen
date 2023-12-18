import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i % 1000000007;
        }
        System.out.println(p);
    }
}
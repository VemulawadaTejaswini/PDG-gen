import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        if (n == 100) {
            n++;
        }
        System.out.println((int)Math.pow(100, d) * n);
    }
}
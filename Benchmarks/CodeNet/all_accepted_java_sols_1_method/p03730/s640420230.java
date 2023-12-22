import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = 1; i <= b; i++) {
            if (a * i % b == c) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
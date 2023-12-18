import java.util.Scanner;

/**
 * Created by malone on 2018/3/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d %d\n", a * b, 2 * (a + b));
    }
}


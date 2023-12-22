import java.util.Scanner;

/**
 * Easy Linear Programming.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var k = scanner.nextInt();

        var sum = Math.min(k, a);
        var remaining = Math.min(k - a - b, c);
        sum += remaining > 0 ? -1 * remaining : 0;
        System.out.println(sum);
    }
}

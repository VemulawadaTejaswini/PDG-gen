import java.util.Scanner;

/**
 * We Love Golf.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var k = Integer.parseInt(scanner.next());
        var a = Integer.parseInt(scanner.next());
        var b = Integer.parseInt(scanner.next());

        var achieved = false;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                achieved = true;
                break;
            }
        }
        System.out.println(achieved ? "OK" : "NG");
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        for (int i = 0; i < n; ++i) {
            if (i == k - 1) {
                System.out.print((char)(s.charAt(i) - 'A' + 'a'));
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
}

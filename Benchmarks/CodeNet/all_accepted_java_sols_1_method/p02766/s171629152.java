
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int base = scanner.nextInt();
        String ans = Integer.toString(num, base);
        System.out.println(ans.length());
    }
}

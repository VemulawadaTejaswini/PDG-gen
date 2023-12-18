
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        alphabet++;
        System.out.println(alphabet);
    }
}

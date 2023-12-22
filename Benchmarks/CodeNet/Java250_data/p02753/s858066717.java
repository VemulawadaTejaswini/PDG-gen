
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String station = scanner.nextLine();
        if (station.indexOf("A")>=0 && station.indexOf("B")>=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

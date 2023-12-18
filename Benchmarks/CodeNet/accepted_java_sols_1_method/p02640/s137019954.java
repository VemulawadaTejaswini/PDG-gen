import java.util.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (y % 2 == 0 && y >= 2 * x && y <= 4 * x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
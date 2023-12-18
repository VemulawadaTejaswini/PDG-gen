
import java.util.Scanner;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int d = a / b;
        int r = a % b;
        double f = 1.0 * a / b;
        
        System.out.println(d + " " + r +" " + String.format("%8f", f));
    }
    
}



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
        int r = scan.nextInt();
        
        double S = r * r * Math.PI;
        double l = 2 * r * Math.PI;
        
        System.out.println(String.format("%8f", S) + " " + String.format("%8f", l));
    }
    
}



import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        r = sc.nextDouble();
        
        System.out.printf("%.10f  %.10f",r * r * Math.PI, (2 * r) * Math.PI);
        
    }
    
}


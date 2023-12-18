
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
        int c = scan.nextInt();
        int count = 0;
        
        for (int i = a; i <= b; i++) {
            if(c%i == 0) count++;
        }
        System.out.println(count);
    }
    
}


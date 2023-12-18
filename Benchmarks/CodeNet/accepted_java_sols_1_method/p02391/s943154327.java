
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a>b) {
            System.out.println("a > b");
            
        } else if (a<b){
            System.out.println("a < b");
            
        } else {
            System.out.println("a == b");
        }
    }
    
}


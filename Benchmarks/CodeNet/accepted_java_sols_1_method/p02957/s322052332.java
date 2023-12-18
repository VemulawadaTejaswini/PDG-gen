
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c = b+a;
        if(c%2==1){
            System.out.print("IMPOSSIBLE");
        } else{
            System.out.print(c/2);
        }
    }
    
}

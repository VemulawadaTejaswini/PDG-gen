
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
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min,max;
        if(a>c){
            min = a;
        } else {
            min = c;
        }
        if(b < d){
            max = b;
        } else {
            max = d;
        }
        int ans = max-min;
        if(ans < 0)ans = 0;
        System.out.print(ans);
           
    }
    
}

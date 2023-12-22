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
        if(a<6){
            System.out.print(0);
            return;
        }else if(a > 12){
            System.out.print(b);
            return;
        } else {
            System.out.print(b/2);
        }
        
    }
    
}

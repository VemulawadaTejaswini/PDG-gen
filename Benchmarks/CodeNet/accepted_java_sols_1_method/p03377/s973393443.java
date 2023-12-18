import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        
        if (X < A){
            System.out.println("NO");
        }else if(X > (A + B)) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    
}

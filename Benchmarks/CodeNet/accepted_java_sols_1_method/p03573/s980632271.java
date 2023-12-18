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
        int C = sc.nextInt();
        if (A==B){
            System.out.println(C);
        }else{
            if (A==C){
                System.out.println(B);
            }else{
                System.out.println(A);
            }
        }
    }
}

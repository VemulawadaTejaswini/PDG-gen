import java.util.Arrays;
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
        
        int A[] = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        
        Arrays.sort(A);
        
        int sum = 0;
        sum = Math.abs(A[1]-A[0]);
        sum += Math.abs(A[2]-A[1]);
        
        System.out.println(sum);
        
    }
    
}

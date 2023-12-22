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
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print(x[n-1]);
        for(int i = n-2; i >= 0; i--) {
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }
}
    

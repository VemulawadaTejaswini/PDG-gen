
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int q = s.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < q; i ++) {
            int a = s.nextInt();
            scores [a - 1] ++;
        }
        
        for (int i = 0; i < n; i ++) {
            scores [i] += k - q;
            if (scores [i] > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
    }
    
}

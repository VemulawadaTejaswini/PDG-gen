
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int[] bs = new int[n - 1];
        bs[0] = s.nextInt();
        
        int sum = bs[0];
        
        for (int i = 1; i < n - 1; i ++) {
            bs[i] = s.nextInt();
            if (bs[i] > bs[i - 1])
                sum += bs[i - 1];
            else
                sum += bs[i];
        }
        
        sum += bs[n - 2];
        
        System.out.println(sum);
    }
    
}

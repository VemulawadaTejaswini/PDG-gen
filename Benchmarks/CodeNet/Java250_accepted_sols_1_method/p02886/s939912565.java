

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ds = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i ++)
        {
            ds [i] = s.nextInt();
            
            for (int j = 0; j < i; j ++) {
                sum += ds [j] * ds [i];
            }
        }
        
        System.out.println (sum);
    }
    
}

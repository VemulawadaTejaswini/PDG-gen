
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int h = 0;
        int count = 0;
        
        for (int i = 0; i < n; i ++) {
            int in = s.nextInt();
            if (in >= h) {
                h = in;
                count ++;
            }
        }
        
        System.out.println(count);
        
    }
    
}

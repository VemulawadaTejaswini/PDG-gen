
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        
        int c = 0;
        int maxC = 0;
        
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'C' || str.charAt(i) == 'G' || str.charAt(i) == 'T') {
                c ++;
                if (c > maxC)
                    maxC = c;
            } else
                c = 0;
        }
        
        System.out.println(maxC);
        
    }
    
}

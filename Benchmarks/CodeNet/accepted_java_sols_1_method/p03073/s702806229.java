
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int changes = 0;
        
        char[] cs = {str.charAt(0), '0'};
        if (cs[0] == '0')
            cs[1] = '1';
        
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) != cs[i % 2])
                changes ++;
                
        }
        
        System.out.println(changes);
        
    }
    
}

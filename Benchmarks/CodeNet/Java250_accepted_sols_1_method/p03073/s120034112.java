
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        
        char[] cs = str.toCharArray();
        int changes = 0;
        
        for (int i = 1; i < str.length(); i ++) {
            if (cs[i] == cs[i - 1]) {
                changes ++;
                if (cs[i] == '0')
                    cs[i] = '1';
                else
                    cs[i] = '0';
            }
                
        }
        
        
        System.out.println(changes);
        
    }
    
}

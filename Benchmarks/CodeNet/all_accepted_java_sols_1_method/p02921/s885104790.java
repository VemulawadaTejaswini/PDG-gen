
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String y = in.next();
        int cnt = 0;
        for (int i = 0; i < x.length(); i++) {
            
            if (x.charAt(i) == y.charAt(i)) {
                cnt++;
            }
            
        }
        System.out.println(cnt);
        
    }
    
}

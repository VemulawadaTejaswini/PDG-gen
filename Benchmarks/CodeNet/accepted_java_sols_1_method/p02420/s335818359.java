import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.next();
            int l = s.length();
            if (s.equals("-")) {
                break;
            }
            
            int m = sc.nextInt();
        
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                s = s + s.substring(0, h);
                s = s.substring(h);
            }
            System.out.println(s);
        }
    }
}

import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        boolean ans = false;
        
        s = s + s;
        
        if (s.indexOf(p) >= 0) {
            ans = true;
        }
            
        System.out.println(ans?"Yes":"No");
    }
}

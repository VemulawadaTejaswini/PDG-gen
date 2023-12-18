import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String end = "END_OF_TEXT";
        int ans = 0;
        
        
        while(sc.hasNext()) {
            String s = sc.next();
            if (s.equals(end)) {
                break;
            }
            s = s.toLowerCase();
            if (s.equals(w)) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}

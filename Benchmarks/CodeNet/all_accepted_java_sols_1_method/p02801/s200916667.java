import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String al="abcdefghijklmnopqrstuvwxyz";
        String N = sc.next();
        String ans="a";
        
        for (int i = 0; i < 26; i++) {
            if (N.equals(al.substring(i,i+1))) {
                ans = al.substring(i+1,i+2);
            }

        }
        out.print(ans);
       
    }
}
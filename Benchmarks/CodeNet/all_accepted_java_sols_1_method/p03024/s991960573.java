import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int s_n = s.length();
        for(int i = 14 - s_n; i >=0; i-- ){
            s = s + "o";
        }

        s = s.replaceAll("x", "");
        
        if(s.length()>=8){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        
    }
}

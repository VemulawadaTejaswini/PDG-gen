import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        
        if( 
           c1[s1.length()-1] == c2[ 0 ]
           &&
           c2[s2.length()-1] == c3[ 0 ]
            
          )System.out.print("YES");
        else System.out.print("NO");


        System.out.println();
    }

}
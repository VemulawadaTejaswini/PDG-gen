import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        
        String str1 = a.toUpperCase();
        String str2 = b.toUpperCase();
        String str3 = c.toUpperCase();

        System.out.print( str1.substring(0, 1) );
        System.out.print( str2.substring(0, 1) );
        System.out.print( str3.substring(0, 1) );


        System.out.println();
    }

}
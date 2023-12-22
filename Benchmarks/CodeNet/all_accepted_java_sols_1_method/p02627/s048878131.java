import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if( Character.isUpperCase( str.charAt( 0 ) ) ) {
            System.out.println( "A" );
        }
        else {
            System.out.println( "a" );
        }
    }
}

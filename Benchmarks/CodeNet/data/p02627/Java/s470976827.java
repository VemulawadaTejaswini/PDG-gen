import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        if (Character.isUpperCase( str.charAt( 0 ) )) {
            System.out.println("A");
        } else 
            System.out.println("a");

    }
}

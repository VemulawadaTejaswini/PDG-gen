import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
        String str = sc.next();
        
        if (n < str.length()) {
          	System.out.print(str.substring(0,n-1));
          	System.out.println("...");
        } else {
          	System.out.println(str);
        }
        
    }
}
import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
        String s = sc.next();
      	String t = sc.next();
      
      	String[] sa = s.split("", 0);
      	String[] ta = t.split("", 0);
      	
      	for (int i = 0; i < n; i++) {
          	System.out.print(sa[i] + ta[i]);
        }
      	System.out.println();
    }
}
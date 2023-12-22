import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int k = sc.nextInt();
        
        int result = 0;
        if(k <= a) System.out.println(k);
        else if (k <= a+b) System.out.println(a);
        else System.out.println(a-(k-(a+b)));
    }
}
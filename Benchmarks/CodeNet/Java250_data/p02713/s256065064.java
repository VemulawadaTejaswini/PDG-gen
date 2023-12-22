import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
      	int num = Integer.parseInt(s.next());
      
      	long result = 0;
      	
      	for(int i = 1; i <= num; i++)
          for(int j = 1; j <= num; j++)
            for(int k = 1; k <= num; k++) result += (long)(gcd(i,gcd(j,k)));
      	
      	System.out.println(result);
    }
  
  	public static int gcd(int x, int y) {
      	if (x < y) swap(x, y);
      	if (x % y == 0) return y;
      	else return gcd(y, x%y);
    }
  	
  	public static void swap(int x, int y) {
        int t = x;

        x = y;
        y = t;
    }
}
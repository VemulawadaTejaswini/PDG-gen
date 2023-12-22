import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
      	int num = Integer.parseInt(s.next());
      
      	long result = 0;
      	
      	for(int i = 1; i <= num; i++) {
          	if(i%3 != 0 && i%5 != 0) result += (long)i;
        }
      	
      	System.out.println(result);
    }
}
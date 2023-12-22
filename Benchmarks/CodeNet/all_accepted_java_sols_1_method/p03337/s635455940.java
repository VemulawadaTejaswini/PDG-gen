import java.io.*;
import java.util.*;

public class Main {
  public static void main( String[] args ) {
	  int a,b,x,y,z;
      Scanner scan = new Scanner(System.in);

   a = scan.nextInt();
   b = scan.nextInt();
   
   x = a + b;
   y = a - b;
   z = a * b;
   
int values[] = {x, y, z};
int max      = values[0];
for (int index = 1; index < values.length; index ++) {
	 max = Math.max(max, values[index]);
     }
	  System.out.println ( max );
  }
}

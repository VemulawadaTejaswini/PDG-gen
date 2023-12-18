import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
	
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int A =  scan.nextInt();
      int B =  scan.nextInt();
      int T =  scan.nextInt();
      int i = 0, count = 0;;
      while (i+A <= (T+0.5))
      {
        count++;
         i += A;
      }
      System.out.println(B*count);
    }
}
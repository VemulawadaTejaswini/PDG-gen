import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int X = s.nextInt();
	int count = 0;
	while(X != 0){
		int a = 360/X;
		int b = 360%X;
		count += a;
		X = b;
	}
	System.out.println(count);

    
  }
}
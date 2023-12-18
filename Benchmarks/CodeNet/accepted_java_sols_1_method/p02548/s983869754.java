import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long mod = 1000000007;
	
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int sum = 0;
	for(int i = 1; i < N; i++){
		sum += (N-1)/i;
	}

	System.out.println(sum);
	
	
	
    
  }
}
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long H = input.nextLong();
		long A = input.nextLong();
		long ans = H/A;
		if (H%A!=0) ans++;
		System.out.println(ans);
	}	
}
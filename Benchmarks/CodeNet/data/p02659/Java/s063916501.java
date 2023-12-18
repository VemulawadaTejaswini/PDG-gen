import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		String[] x = input.next().split(".");
		long B = Long.parseLong(x[0]);
		long C = Long.parseLong(x[1]);
		long D = B*100+C;
		long ans = A*D;
		System.out.println(ans);
	}	
}
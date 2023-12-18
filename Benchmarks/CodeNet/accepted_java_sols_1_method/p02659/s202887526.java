import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		String S = input.next();
		String whole = S.substring(0,1);
		String decimal = S.substring(2,4);
		long B = Long.parseLong(whole);
		long C = Long.parseLong(decimal);
		long D = B*100+C;
		long ans = A*D;
		ans/=100;
		System.out.println(ans);
	}	
}
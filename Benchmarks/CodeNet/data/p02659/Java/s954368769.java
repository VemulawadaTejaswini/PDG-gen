import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		double A = input.nextLong();
		double B = input.nextDouble();
		B*=100;
		long b = (long)(B);
		double ans = A*B;
		ans/=100;
		System.out.println((long)(ans));
	}	
}
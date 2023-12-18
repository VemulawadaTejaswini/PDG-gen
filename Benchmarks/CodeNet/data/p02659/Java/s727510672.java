import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		B*=100.0;
		long ans = (long)(A*B);
		ans/=100;
		System.out.println(ans);
	}	
}
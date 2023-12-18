import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double ans = A*B;
		ans=(long)(ans);
		long real = (long)ans;
		System.out.println(real);
	}	
}
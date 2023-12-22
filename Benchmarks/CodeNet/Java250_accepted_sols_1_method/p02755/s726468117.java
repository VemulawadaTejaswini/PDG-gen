import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		double a_low = a / 0.08;
		double a_high = (a+1) / 0.08;
		double b_low = b / 0.1;
		double b_high = (b+1) / 0.1;
		double low = Math.max(a_low, b_low);
		double high = Math.min(a_high, b_high);
		if(high<=low) System.out.print("-1");
		//else if (high==low && (high%1!=0) && (low%1!=0)) System.out.print("-1");
		else {
//		System.out.println(low + " " + high);
		System.out.print((int)Math.ceil(low));
		}
	}
}

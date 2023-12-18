import java.util.*;

class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double a, b;
		
		a = (double)r * r * 3.141592653589;
		b = (double)r * 2 * 3.141592653589;
		
		System.out.println(String.format("%.6f", a) + " " + String.format("%.6f", b));
	}
}

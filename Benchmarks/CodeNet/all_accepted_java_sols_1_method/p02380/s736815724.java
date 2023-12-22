import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int C = scan.nextInt();
		double S = (double) 1 / (double) 2 * (double) a
 			* (double) b
			* Math.sin(Math.toRadians((double)C));
		double L = (double) a + (double) b +
			Math.sqrt(Math.pow((double) a, 2) 
			+ Math.pow((double) b, 2)
			- (double) 2 * (double) a * (double) b
			* Math.cos(Math.toRadians((double) C)));
		double h = (double) b 
			* Math.sin(Math.toRadians((double) C));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}
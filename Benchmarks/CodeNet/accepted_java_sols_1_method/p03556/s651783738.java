import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double N = sc.nextDouble();
		
		for (double i = N; i >= 0; i--) {
			double root = Math.sqrt(i);
			if (root % 1 == 0) {
				System.out.println((int)i);
				return;
			}
		}
		
	}
}

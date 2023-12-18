import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a / b;
		int r = a % b;
		double f = (double) a / (double) b;
		System.out.printf("%d %d %f\n", d, r, f);
	}
}
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt();
		double b = sc.nextInt();
		
		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		double f = a / b;

		System.out.print(d + " " + r + " " + f);
	}
}
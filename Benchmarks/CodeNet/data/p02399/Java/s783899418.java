import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int q = a / b;
		int r = a % b;
		double f = 1.0 * a / b;
		
		System.out.print(q + " " + r + " ");
		System.out.printf("%.5f", f);
	}
}

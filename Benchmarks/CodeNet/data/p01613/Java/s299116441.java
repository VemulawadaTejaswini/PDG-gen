import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a, b, c, d;
		int min = Integer.MAX_VALUE;
		int x1, y1, x2, y2;
		int x3, y3, x4, y4;
		
		n = sc.nextInt();
		a = sc.nextInt() - 1;
		b = sc.nextInt() - 1;
		c = sc.nextInt() - 1;
		d = sc.nextInt() - 1;
		
		for (int i = 1; i <= n; i++) {
			x1 = a % i;
			y1 = a / i;
			x2 = b % i;
			y2 = b / i;
			x3 = c % i;
			y3 = c / i;
			x4 = d % i;
			y4 = d / i;
			
			int k1 = Math.abs(x1 - x2) + Math.abs(y1 - y2);
			int k2 = Math.abs(x3 - x4) + Math.abs(y3 - y4);
			min = Math.min(min, k1 + k2);
		}
		
		System.out.println(min);
	}
}
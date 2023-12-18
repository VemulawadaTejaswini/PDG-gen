import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, h;
		
		x = sc.nextInt();
		h = sc.nextInt();
		while (x + h != 0) {
			double s = 0.0;
			double bottom = x * x * 1.0;
			double height = Math.sqrt(h * h * 1.0 + x * x * 1.0 / 4);
			double triangle = x * 1.0 * height / 2;
			
			s = bottom + 4 * triangle;
			System.out.println(s);
			
			x = sc.nextInt();
			h = sc.nextInt();
		}
	}
}
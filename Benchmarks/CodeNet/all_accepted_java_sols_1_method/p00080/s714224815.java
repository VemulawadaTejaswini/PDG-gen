import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double q = sc.nextDouble();
			if(q == -1.0) break;
			double x = q / 2;
			while(Math.abs(x * x * x - q) > 0.00001 * q) {
				x = x - (x * x * x - q) /  (3 * x * x);
			}
			System.out.println(x);
		}
		sc.close();
	}
}

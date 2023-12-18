import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = Double.parseDouble(sc.next());
		if (d - (int)d == 0) {
			double e = Math.sqrt(d * d + 0.5 * 0.5);
			e = Math.sqrt(e * e - 0.5 * 0.5) + 1;
			System.out.println(e);
		}
		else {
			System.out.println(d / Math.sqrt(2) * 2);
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next()); sc.close();
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
		System.out.printf("%d %d %.7f\n", d, r, f);
	}

}
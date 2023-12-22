import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = Integer.parseInt(s.next());

		double[] x = new double[n];
		String[] u = new String[n];

		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(s.next());
			u[i] = s.next();
		}
		double amount = 0.0;

		for (int i = 0; i < n; i++) {
			if (u[i].equals("JPY")) {
				amount += x[i];
			} else {
				amount += x[i] * 380000.0;
			}
		}
		System.out.println(amount);
	}
}
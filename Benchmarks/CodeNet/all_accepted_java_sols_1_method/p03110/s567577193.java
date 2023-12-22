import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		//int k = stdIn.nextInt();
		double[] x = new double[n];
		String[] u = new String[n];
		for (int i = 0; i < n; i++) {
			x[i] = stdIn.nextDouble();
			u[i] = stdIn.next();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			if (u[i].equals("JPY"))
				sum = sum + x[i];
			else
				sum = sum + x[i] * 380000;
		}
		System.out.println(sum);
	}
}
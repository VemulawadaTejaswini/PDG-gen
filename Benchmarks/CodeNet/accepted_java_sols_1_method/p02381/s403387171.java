import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> data = new ArrayList<>();
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int sum = 0;
			int[] s = new int[n];
			double m;
			double a;
			double sigma = 0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			m = (double) sum / n;
			for (int i = 0; i < n; i++) {
				sigma += Math.pow(s[i] - m, 2) / n;
			}
			a = Math.sqrt(sigma);
			data.add(a);
		}
		for (int i = 0; i < data.size(); i++) {
			System.out.printf("%f%n", data.get(i));
		}
		sc.close();
	}
}

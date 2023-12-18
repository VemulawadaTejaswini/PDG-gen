
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		
		while (true) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}

			int[] s = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				s[i] = scan.nextInt();
				sum += s[i];
			}
			double m = (double)sum / n;

			double alpha = 0;
			for (int i = 0; i < n; i++) {
				alpha += (s[i] - m) * (s[i] - m);
			}
			alpha = Math.sqrt(alpha / n);
			list.add(alpha);
		}

		for (Double alpha : list) {
			System.out.println(alpha);
		}
		
		scan.close();
	}

}
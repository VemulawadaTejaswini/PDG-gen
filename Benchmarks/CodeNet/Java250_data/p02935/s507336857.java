import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double[] v = new double[n];
		for(int i = 0 ; i < n ; i++) {
			v[i] = (double)sc.nextInt();
		}
		Arrays.sort(v);
		double ans = v[0];
		for(int i = 1 ; i < n ; i++) {
			ans = (ans + v[i]) / 2;
		}
		System.out.println(ans);
		sc.close();

	}

}

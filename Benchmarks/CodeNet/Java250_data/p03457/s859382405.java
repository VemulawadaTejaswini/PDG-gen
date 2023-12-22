import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for(int t_i = 0; t_i < n; t_i++) {
			t[t_i + 1] = scan.nextInt();
			x[t_i + 1] = scan.nextInt();
			y[t_i + 1] = scan.nextInt();

			int dt = t[t_i+1] - t[t_i];
			int dist = Math.abs(x[t_i+1] - x[t_i]) + Math.abs(y[t_i+1] - y[t_i]);

			if ((dist>dt) || ((dt % 2) != (dist % 2))) {
					System.out.println("No");
					return;
			}
		}
		System.out.println("Yes");
	}

}

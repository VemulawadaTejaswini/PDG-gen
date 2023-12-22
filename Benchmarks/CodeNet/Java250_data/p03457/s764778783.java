import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		x[0] = y[0] = t[0] = 0;
		for (int i = 1; i <= n; i++) {
			t[i] = scan.nextInt();
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}

		boolean f = true;

		for (int i = 1; i <= n; i++) {
			int dist = 0;
			dist = Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
			//System.out.println("dist : "+dist);
			//System.out.println("t : "+ (t[i]-t[i-1]));
			if (dist > t[i]-t[i-1]) {
				f = false;
				break;
			} else {
				if ((t[i]-t[i-1]-dist) % 2 == 1) {
					f = false;
					break;
				}
			}
		}

		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("");
	}
}

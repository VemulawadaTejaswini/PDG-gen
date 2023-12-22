import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int D = Integer.parseInt(scan.next());
		int[] X = new int[N];
		int[] Y = new int[N];
		int ans = 0;
		for (int n = 0;n < N ;n++ ) {
			X[n] = Integer.parseInt(scan.next());
			Y[n] = Integer.parseInt(scan.next());
			long xx = (long)Math.pow(X[n], 2);
			long yy = (long)Math.pow(Y[n], 2);
			if (Math.sqrt(xx + yy) <= D) {
				ans++;
			}
		}
		scan.close();
		System.out.println(ans);
	}

}

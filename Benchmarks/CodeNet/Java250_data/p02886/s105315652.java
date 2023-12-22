import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n];
		int sum = 0;
		for ( int i = 0; i < n; i++ ) {
			d[i] = in.nextInt();
			sum += d[i];
		}

		int ans = 0;
		for ( int i = 0; i < n; i++ ) {
			sum -= d[i];
			ans += sum*d[i];
			sum += d[i];
		}
		System.out.println(ans/2);
		in.close();
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hi = 0;
		int[] x = new int[n], y = new int[n], h = new int[n];
		for ( int i = 0; i < n; i++ ) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			h[i] = in.nextInt();

			if ( h[i] != 0 ) hi = i;
		}
		in.close();

		for ( int cy = 0; cy <= 100; cy++ ) {
			for ( int cx = 0; cx <= 100; cx++ ) {
				boolean match = true;
				int Height = h[hi] + Math.abs(x[hi] - cx) + Math.abs(y[hi] - cy);

				for ( int i = 0; i < n; i++ ) {
					int tempH = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
					
					if ( h[i] != 0 && Height != tempH ) {
						match = false;
						break;
					}
					if ( h[i] == 0 && Height > tempH ) {
						match = false;
						break;
					}
				}
				if ( match ) {
					System.out.println(cx + " " + cy + " " + Height);
					return;
				}
			}
		}
	}
}

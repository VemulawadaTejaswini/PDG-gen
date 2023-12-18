import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] lx = new int[n];
		int[] ly = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			lx[i] = x[i];
			ly[i] = y[i];
		}
		Arrays.sort(lx);
		Arrays.sort(ly);

		Long ans = 1L * (lx[n-1]-lx[0]) * (ly[n-1]-ly[0]);

		for(int xi = 0; xi < n; xi++) {
			for(int xj = 0; xj < n; xj++) {
				for(int yi = 0; yi < n; yi++) {
					for(int yj = 0; yj < n; yj++) {
						int num = 0;
						Long lX = (long) lx[xi],rX = (long) lx[xj];
						Long upY = (long) ly[yi], underY = (long) ly[yj];

						for(int i = 0; i < n; i++) {
							if(lX <= x[i] && x[i] <= rX && underY <= y[i] && y[i] <= upY) {
								num++;
							}
						}

						if(num >= k) {
							ans = Math.min(ans, 1L * (rX - lX) * (upY - underY));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
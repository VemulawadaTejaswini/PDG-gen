import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];
		int[] a = new int[N];
		for (int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		int[][] grid = new int[W][H];
		for (int i=0; i<N; i++) {
			if (a[i] ==1) {
				for (int j=0; j<x[i]; j++) {
					for (int k=0;  k<H; k++) {
						grid[j][k] = 1;
					}
				}
			}else if (a[i] ==2) {
				for (int j=x[i]; j<W; j++) {
					for (int k=0;  k<H; k++) {
						grid[j][k] = 1;
					}
				}
			}else if (a[i] ==3) {
				for (int j=0; j<W; j++) {
					for (int k=0;  k<y[i]; k++) {
						grid[j][k] = 1;
					}
				}
			}else if (a[i] ==4) {
				for (int j=0; j<W; j++) {
					for (int k=y[i];  k<H; k++) {
						grid[j][k] = 1;
					}
				}
			}
		}
		int res = 0;
		for (int j=0; j<W; j++) {
			for (int k=0;  k<H; k++) {
				if (grid[j][k] == 0) res ++;
			}
		}
		System.out.println(res);
	}
}

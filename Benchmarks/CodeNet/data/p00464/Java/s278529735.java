import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h, w, n;
		int a[][];
		
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		while (h + w + n != 0) {
			a = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			int j = 0;
			int k = 0;
			for (int i = 0; i < n; i++) {
				j = 0;
				k = 0;
				while (j < h && k < w) {
					if (a[j][k] == 0) {
						a[j][k] = 1;
						j++;
					} else {
						a[j][k] = 0;
						k++;
					}
				}
			}
			System.out.println((j + 1) + " " + (k + 1));
			
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
		}
	}
}
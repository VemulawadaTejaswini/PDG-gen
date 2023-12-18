import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int b, f, r, v;
		int stay[][][] = new int[4][3][10];
		int i, j, k, l, m;
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				for(k = 0; k < 10; k++) {
					stay[i][j][k] = 0;
				}
			}
		}
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for(i = 0; i < n; i++) {
				b = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
				v = sc.nextInt();
				stay[b-1][f-1][r-1] += v;
			}
			for(i = 0; i < 4; i++) {
				for(j = 0; j < 3; j++) {
					for(k = 0; k < 10; k++) {
						System.out.print(" " + stay[i][j][k]);
					}
					System.out.println();
				}
				if(i < 3) System.out.println("####################");
			}
		}
	}
}



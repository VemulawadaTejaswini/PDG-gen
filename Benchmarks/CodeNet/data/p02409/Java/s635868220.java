import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N_FLOOR = 10;
		int N_H = 3;
		int N_TO = 4;
		int table[][][] = new int[N_TO][N_H][N_FLOOR];

		int n, b, f, r, v;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			b = in.nextInt() - 1;
			f = in.nextInt() - 1;
			r = in.nextInt() - 1;
			v = in.nextInt();

			table[b][f][r] += v;
		}
		for(int i=0; i < N_TO;i++) {
			for(int j=0;j<N_H;j++) {
				for(int k=0;k<N_FLOOR;k++) {
					System.out.print(" "+table[i][j][k]);
				}
				System.out.println("");
			}
			if(i != N_TO-1) {
				System.out.println("####################");
			}
		}
	}
}
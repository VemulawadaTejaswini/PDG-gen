import static java.lang.System.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int room[][][] = new int[4][10][3];
		
		for(int a = 1; a <= count; a++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			room[b - 1][r - 1][f - 1] += v;
		}
		for(int a = 0; a < 4; a++) {
			for(int b = 0; b < 3; b++) {
				for(int c = 0; c < 10; c++) {
					if(a == 3 && b == 2 && c == 9) {
						out.println(" " + room[a][c][b]);
						exit(0);
					}else {
						out.print(" " + room[a][c][b]);
					}
				}
				out.println();
			}
			if(a != 3) {
				out.println("####################");
			}else {
				out.println();
			}
		}
	}
}

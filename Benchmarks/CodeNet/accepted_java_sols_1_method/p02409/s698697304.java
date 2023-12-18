import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner .nextInt();
		int[][][] heya = new int[4][3][10];
		for (int i=0; i<n; i++) {
			int b = scanner .nextInt();
			int f = scanner .nextInt();
			int r = scanner .nextInt();
			int v = scanner .nextInt();
			heya[b-1][f-1][r-1] = v + heya[b-1][f-1][r-1];
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<10; k++) {
					System.out.print(" "+heya[i][j][k]);
				}
				System.out.println();
			}
			if(i<3)
				System.out.println("####################");
		}
	}
}

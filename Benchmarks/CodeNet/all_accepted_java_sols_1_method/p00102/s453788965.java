
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			if(a==0)
				break;
			int[] sum = new int[a];
			int[] sum2 = new int[a];
			int sumA = 0;
			int[][] b = new int[a][a];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					sum[i] += b[i][j];
					sum2[j] += b[i][j];
				}
				sumA += sum[i];
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < a; j++) {
					System.out.printf("%5d", b[i][j]);
				}
				System.out.printf("%5d", sum[i]);
				System.out.println();
			}
			for (int i = 0; i < a; i++) {
				System.out.printf("%5d", sum2[i]);
			}
			System.out.printf("%5d", sumA);
			System.out.println();

		}
	}

}


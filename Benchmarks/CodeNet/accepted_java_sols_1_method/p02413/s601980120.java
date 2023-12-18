import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = Integer.parseInt(in.next());
		int c = Integer.parseInt(in.next());
		int[][] num = new int[r][c];
		int sumAll = 0;
		int[] sumR = new int[r];
		int[] sumC = new int[c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				num[i][j] = Integer.parseInt(in.next());
				sumR[i] += num[i][j];
				sumC[j] += num[i][j];
				sumAll += num[i][j];
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(num[i][j] + " ");	
			}
			System.out.println(sumR[i]);
		}
		for (int j = 0; j < c; j++) {
			System.out.print(sumC[j] + " ");
		}
		System.out.println(sumAll);
		in.close();
	}
}	

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int nums[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				int a = sc.nextInt();
				nums[i][k] = a;
			}
		}
		int matrix[][] = new int[m][l];
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < l; k++) {
				int b = sc.nextInt();
				matrix[i][k] = b;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < l; k++) {
				long c = 0;
				for (int j = 0; j < m; j++) {
					c = nums[i][j] * matrix[j][k] + c;
				}
				System.out.print(c);
				if (k + 1 != l) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int leftDiag = 0, rightDiag = 0;
		int row[] = new int[3], col[] = new int[3];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt(), flag = 0;
			for (int k = 0; k < 3 && flag == 0; k++)
				for (int j = 0; j < 3; j++)
					if (matrix[k][j] == temp) {
						if (k == j) 
							leftDiag++;
						
						if (k + j == 2)
							rightDiag++;
						row[k]++;
						col[j]++;
						flag = 1;
						break;
					}
		}
		int ans = 0;
		for (int i = 0; i < col.length; i++) {
			if (col[i] == 3)
				ans = 1;
		}
		for (int i = 0; i < col.length; i++) {
			if (row[i] == 3)
				ans = 1;
		}
		if (rightDiag == 3)
			ans = 1;
		if (leftDiag == 3)
			ans = 1;
		System.out.println((ans == 1) ? "Yes" : "No");
		sc.close();
	}
}

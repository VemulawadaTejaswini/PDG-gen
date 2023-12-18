import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		int[] a = new int[3];
		int[] b = new int[3];
		boolean flag = false;

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i <= 100; i++) {
			a[0] = i;
			b[0] = c[0][0] - i;
			b[1] = c[0][1] - i;
			b[2] = c[0][2] - i;
			a[1] = c[1][0] - b[0];
			a[2] = c[2][0] - b[0];
			flag = true;
			for(int m = 0; m < 3; m++) {
				for(int k = 0; k < 3; k++) {
					if(c[m][k] != (a[m] + b[k])) flag = false;
				}
			}
			if(flag) break;
		}

		System.out.println(flag ? "Yes" : "No");
		sc.close();
	}
}
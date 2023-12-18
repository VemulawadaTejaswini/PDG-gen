import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		boolean[][] af = new boolean[3][3];
		boolean flag = false;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(a[j][k] == b[i])af[j][k] = true;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			if(af[i][0]&&af[i][1]&&af[i][2])flag = true;
			if(af[0][i]&&af[1][i]&&af[2][i])flag = true;
		}
		if(af[0][0]&&af[1][1]&&af[2][2])flag = true;
		if(af[2][0]&&af[1][1]&&af[0][2])flag = true;

		if(flag)System.out.println("Yes");
		if(!flag)System.out.println("No");
	}

}

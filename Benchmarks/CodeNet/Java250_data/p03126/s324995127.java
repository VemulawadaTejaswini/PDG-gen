import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				a[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int temp = sc.nextInt()-1;
				a[i][temp] = 1;
			}
		}
		for(int i = 0; i < m; i++) {
			boolean flag = true;
			for(int j = 0; j <n; j++) {
				if(a[j][i]==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}

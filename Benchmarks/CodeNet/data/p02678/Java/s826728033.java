import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int path[][] = new int[m][m];
		
		/* 配列に読み込み */
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				path[i][j] = 999;
			}
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			path[a-1][b-1] = 1;
			path[b-1][a-1] = 1;
		}
		
		int s = 1;
		while (s < n) {
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					for(int k = 0; k < m; k++) {
						if (path[i][k] + path[k][j] < path[i][j]) {
							path[i][j] = path[i][k] + path[k][j];
							path[j][i] = path[i][k] + path[k][j];
						}
					}
				}
			}
			
			s++;
		}
		
		for (int i = 1; i < n; i++) {
			if (path[0][i] == 999) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		
		for (int i = 1; i < n; i++) {
			System.out.println(path[0][i]);
		}
		
        sc.close();
	}
}
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		boolean[][] space = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			String scan = sc.next();
			for(int j = 0; j < m; j++) {
				if(scan.charAt(j) =='.') {
					space[i][j] = true;
				}else {
					space[i][j] = false;
				}
			}
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j <= m - d; j++) {
				boolean flag = true;
				for(int l = j; l < j + d; l++) {
					if(!space[i][l]) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					ans++;
				}
			}
		}
		
		for(int j = 0; j < m; j++) {
			for(int i =0; i <= n - d; i++) {
				boolean flag = true;
				for(int k = i; k < i + d; k++) {
					if(!space[k][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}
}

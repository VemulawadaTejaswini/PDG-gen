
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] x = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				x[i][j] = sc.nextInt();				
			}
		}
		Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));
		
		int ans = n-1;
		int st = 0;
		if(n == 1 || n == 2) {
			ans = 1;
		}else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i != j) {
						int tmp = 0;
						for(int k = 0; k < n; k++) {
							for(int m = 0; m < n; m++) {
								int x1 = x[j][0] - x[i][0];
								int y1 = x[j][1] - x[i][1];
								int x2 = x[m][0] - x[k][0];
								int y2 = x[m][1] - x[k][1];
								if(x1 == x2 && y1 == y2) {
									if(j != m || k != i) {
										tmp ++;
									}
								}
							}
						}
						st = Math.max(st, tmp);
					}
					
				}
			}
		}
		System.out.println(ans-st);
		sc.close();
	}


}

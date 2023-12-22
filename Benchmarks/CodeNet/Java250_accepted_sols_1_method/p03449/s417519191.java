import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][]a = new int [n][2];
		
		for(int i = 0; i <= 1 ; i++) {
			for(int j = 0; j < n ; j++) {
				a[j][i] = sc.nextInt();
			}
		}
		int ans = 0;
		
		for(int i = 0; i < n ;i++) {
			int sum = 0;
			int x = 0;
			int y = 0;
			for(int j = 0; j <= n ; j++) {
				sum += a[x][y];
				
				if(x != i || y == 1) {
					x = x + 1 ;
				}
				else {
					y = 1;
				}
				
			}
			ans = Math.max(ans, sum);

		}
		System.out.println(ans);

	}

}

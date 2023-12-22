import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int[][] a = new int[m][n];
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[j][i] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum += a[j][i]*b[j];
			}
			sum += c;
			if(sum > 0)ans++;
		}
		System.out.print(ans);
	}
}

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		int[][] sum = new int[2][n];
		for(int i=0; i<2; i++){
			a[i][0] = sc.nextInt();
			sum[i][0] = a[i][0];
			for(int j=1; j<n; j++){
				a[i][j] = sc.nextInt();
				sum[i][j] += sum[i][j-1] + a[i][j];
			}
		}
		int max = sum[0][0]+sum[1][n-1];
		for(int i=1; i<n; i++){
			max = Math.max(max, sum[0][i]+sum[1][n-1]-sum[1][i-1]);
		}
		System.out.println(max);
	}
}
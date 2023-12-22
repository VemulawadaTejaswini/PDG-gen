import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		long[][] a = new long[n + 1][m + 1];
		long[][] b = new long[m + 1][l + 1];
		long[][] c = new long[n + 1][l + 1];
		int i,j,k;
		for(i = 1; i <= n; ++i){
			for(k = 1; k <= m; ++k){
				a[i][k] = scan.nextInt();
			}
		}
		for(k = 1; k <= m; ++k){
			for(j = 1; j <= l; ++j){
				b[k][j] = scan.nextInt();
			}
		}
		for(i = 1; i <= n; ++i){
			for(j = 1; j <= l; ++j){
				for(k = 1; k <= m; ++k){
					c[i][j] += a[i][k] * b[k][j] ;
				}
			}
				
			}
		for(i = 1; i <= n; ++i){
			for(j = 1; j <= l; ++j){
				if(j == l)
					System.out.println(c[i][j]);
				else 
					System.out.print(c[i][j]+" ");
			}
		}
		}
}
		
		
		


	
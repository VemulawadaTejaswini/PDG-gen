import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, m, l, i, j, k;
		long[][] a = new long[100][100], b = new long[100][100], c = new long[100][100];
		
		for(i = 0; i < 100; i++){
			for(j = 0; j < 100; j++){
				c[i][j] = 0;
			}
		}
		
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		
		for(i = 0; i < n; i++){
			for(j = 0; j < m; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < m; i++){
			for(j = 0; j < l; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < n; i++){
			for(j = 0; j < l; j++){
				for(k = 0; k < m; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for(i = 0; i < n; i++){
			for(j = 0; j < l; j++){
				System.out.print(c[i][j]);
				
				if(j < l-1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
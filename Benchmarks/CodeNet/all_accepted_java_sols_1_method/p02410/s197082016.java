import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int b[] = new int[m];
		int c[] = new int[n];
		int i,r;
		for(i = 0; i < n; ++i){
			for(r = 0; r < m; ++r){
				a[i][r] = scan.nextInt();
			}
		}
		for(i = 0; i < m; i++){
			b[i] = scan.nextInt();
		}
		for(i = 0; i < n; i++){
			for(r = 0; r < m; r++){
				c[i] += a[i][r] * b[r];
			}
			System.out.println(c[i]);
		}
		
 			}

	}


	
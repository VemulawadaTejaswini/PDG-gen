import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int m, n, l;
		long a1;
		long a[][];
		long b[][];
		long c[][];
		
		n = scan.nextInt();
		m = scan.nextInt();
		l = scan.nextInt();
		a = new long[n][m];
		b = new long[m][l];
		c = new long[n][l];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a1 = scan.nextInt();
				a[i][j] = a1;
			}
		}
		for(int i = 0; i < m;i++){
			for(int j = 0; j < l; j++){
				a1 = scan.nextInt();
				b[i][j] = a1;
			}
		}
		
		for(int i = 0; i < n ;i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				if(j != l - 1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
			
	}
}	
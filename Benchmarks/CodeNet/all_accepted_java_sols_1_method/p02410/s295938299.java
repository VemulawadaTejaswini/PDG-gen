import java.util.Scanner;

class Main {

	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);

		int m, n;
		int a1, a2, a3, a4;
		int c;
		int a[][];
		int b[];
		int s[];
		
		n = scan.nextInt();
		m = scan.nextInt();
		a = new int[n][m];
		b = new int[m];
		s = new int[n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a1 = scan.nextInt();
				a[i][j] = a1;
			}
		}
		for(int k = 0; k < m;k++){
			c = scan.nextInt();
			b[k] = c;
		}
		
		for(int i = 0; i < n ;i++){
			for(int j = 0; j < m; j++){
				s[i] += a[i][j] * b[j];
			}
			System.out.println(s[i]);
		}
		
			
	}
}	
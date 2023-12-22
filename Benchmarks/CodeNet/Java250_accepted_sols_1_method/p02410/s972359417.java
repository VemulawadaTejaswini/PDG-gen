import java.util.Scanner;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k, p;
		int n , m;
		int a[][];
		int b[];
		int c[];
		int g[];

		a = new int[100][100];
		b = new int[100];
		c = new int[100];
		g = new int[100];
		n = scan.nextInt();
		m = scan.nextInt();
	
	
		for (k = 0; k < n; k++) {
			for(p = 0; p < m; p++){
				int d = scan.nextInt();
				a[k][p] = d;
				
			}
			
		
		}
			for(p = 0; p < m; p++){
				int e = scan.nextInt();
				b[p] = e;
				
			}
			for (k = 0; k < n; k++) {
				for(p = 0; p < m; p++){
					c[k] = a[k][p] * b[p];
					g[k] += c[k];
				}
				
			
			}
			for (k = 0; k < n; k++) {
				System.out.println(g[k]);
				
			}
			
		
		
		
	}
			
	
}
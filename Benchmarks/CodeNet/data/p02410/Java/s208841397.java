import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] a = new int[n][m];
		int[] b = new int[m];
		
		for(int i1 = 0; i1 < n; i1++) {
			for(int i2 = 0; i2 < m; i2++) {
				a[i1][i2] = sc.nextInt();
			}
		}
		
		for(int i3 = 0; i3 < m; i3++) {
			b[i3] = sc.nextInt();
		}
		
		for(int i4 = 0; i4 < n; i4++) {
			int c = 0;
			
			for(int i5 = 0; i5 < m; i5++) {
				c += a[i4][i5] * b[i5];
			}
			
			System.out.println(c);
		}
	}
}


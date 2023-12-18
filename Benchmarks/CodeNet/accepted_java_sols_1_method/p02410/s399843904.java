import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m]; int[] b = new int[m]; int[] c = new int [n];
		
		//??????a?????????
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				a[i][j] = scan.nextInt();
			}
		}
		//??????b?????????
		for(int j=0; j<m; j++){
			b[j] = scan.nextInt();
		}
		
		//??????c????????????
		for(int i=0; i <n; i++){
			c[i] = 0;
		}
		
		//a??b???c???????´?
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				c[i] = c[i] + (a[i][j] * b[j]);
			}
			System.out.println(c[i]);
		}
	}
}
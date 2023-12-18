import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,m;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] p = new int[n];
		
		for(int i=0;i<n;i++)
			p[i]=0;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=scan.nextInt();
		
		for(int i=0;i<m;i++){
			b[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				p[i]+=a[i][j]*b[j];
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(p[i]);
	}
}

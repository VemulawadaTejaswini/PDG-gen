import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int[][] v=new int[n+1][n+1];
			for(int i=0; i<n; i++) {
				int u=sc.nextInt();
				int k=sc.nextInt();
				for(int j=1; j<=k; j++) {
					int t=sc.nextInt();
					v[u][t]=1;
				}
			}
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(j==1) {
						System.out.print(v[i][j]);
					}
					else {
						System.out.print(" "+v[i][j]);
					}
				}
				System.out.println();
			}
			

		}
	}
}

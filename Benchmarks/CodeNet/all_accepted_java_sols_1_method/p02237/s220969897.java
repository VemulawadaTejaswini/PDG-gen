import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		int[][] graph=new int[n+1][n+1];
		for(int i=0;i<n;i++){
			int u=sc.nextInt();
			int k=sc.nextInt();
			for(int j=0;j<k;j++){
			int v=sc.nextInt();
			graph[u][v]++;
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==n) System.out.println(graph[i][j]);
				else System.out.print(graph[i][j]+" ");
			}
		}
	}
}
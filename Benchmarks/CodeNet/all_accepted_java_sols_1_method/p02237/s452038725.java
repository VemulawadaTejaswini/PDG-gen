import java.util.Scanner;

public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] graph = new int[n][n];
		for (int i=0;i<n;i++) {
			int u = sc.nextInt();
			int k =sc.nextInt();
			for (int j=0;j<k;j++) {
				graph[u-1][sc.nextInt()-1]=1;
			}
		}
		sc.close();
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-1;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.print(graph[i][n-1]);
			System.out.println();
		}
	}
}

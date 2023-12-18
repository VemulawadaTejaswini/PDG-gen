import java.util.*;

public class Main{


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] e = new int[n+1][n+1];
		for(int i = 1; i <= n; i++){
			int u = scan.nextInt();
			int k = scan.nextInt();
			for(int j = 0; j < k; j++){
				int v = scan.nextInt();
				e[u][v] = 1;
			}
		}

		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				if(j !=n)
					System.out.print(e[i][j] + " ");
				else
					System.out.println(e[i][j]);
	}
}
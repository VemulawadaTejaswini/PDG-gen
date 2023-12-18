import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,cnt,j;
		n = sc.nextInt();
		int [][] graph = new int[n][n+1];
		for(i=0;i<n;i++){
			for(j=0;j<=n;j++){
				graph[i][j] =0;
			}
		}
		for(i=0;i<n;i++){
			graph[i][0] = sc.nextInt();
			cnt = sc.nextInt();
			for(j=0;j<cnt;j++){
				graph[i][sc.nextInt()]++;
			}
		}
		for(i=0;i<n;i++){
			for(j=1;j<n;j++){
				System.out.print(graph[i][j]+" ");
			}
				System.out.print(graph[i][n]);
			System.out.println("");
		}
	}

}


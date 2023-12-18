import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=1;i<=n;i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			for(int j=1;j<=k;j++){
				int index=sc.nextInt();
				arr[u-1][index-1]=1;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

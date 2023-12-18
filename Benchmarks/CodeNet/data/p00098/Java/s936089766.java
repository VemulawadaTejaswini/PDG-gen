import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] map = new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				map[i][j] = sc.nextInt() + map[i-1][j] + map[i][j-1] - map[i-1][j-1];
			}
		}
		
		int max = map[1][1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++){
					for(int l=1;l<=n;l++){
						max = Math.max(max, map[k][l] + map[i-1][j-1] - map[i-1][l] - map[k][j-1]);
					}
				}
			}
		}
		
		System.out.println(max);
	}	
}
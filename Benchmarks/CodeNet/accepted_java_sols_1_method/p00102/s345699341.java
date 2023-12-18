import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[n+1][n+1];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j] = sc.nextInt();
					map[i][n] += map[i][j];
				}
				map[n][n] += map[i][n];
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[n][i] += map[j][i];
				}
			}
			
			for(int i=0;i<n+1;i++){
				for(int j=0;j<n+1;j++){
					System.out.printf("%5d", map[i][j]);
				}
				System.out.println();
			}
		}
	}	
}
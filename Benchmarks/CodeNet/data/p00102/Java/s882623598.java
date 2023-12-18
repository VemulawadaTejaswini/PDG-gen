import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<int[][]> result = new ArrayList<int[][]>();
		
		int n;
		while( (n = stdIn.nextInt()) != 0 ){
			int[][] spread = new int[n+1][n+1];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					spread[i][j] = stdIn.nextInt();
					spread[i][n] += spread[i][j];
					spread[n][j] += spread[i][j];
					spread[n][n] += spread[i][j];
				}				
			}
			result.add(spread);
						
		}
		
		for(int[][] ans : result){
			for(int[] x : ans){
				for(int y : x){
					System.out.printf("%5d",y);
				}
				System.out.println();
			}
		}
	}
}
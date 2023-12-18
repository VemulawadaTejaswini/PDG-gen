import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int[] ans = new int[1000];
		int index = 0;
		
		while( x != 0 || y != 0 ){
			int n = stdIn.nextInt();
		
			int[][] result = new int[x][y];
			result[0][0] = 1;
		
			for(int i = 0; i < n; i++){
				int aX = stdIn.nextInt();
				int aY = stdIn.nextInt();
				result[aX-1][aY-1] = -1;
			}
			for(int i = 1; i < x; i++){
				if( result[i][0] == -1 ){
					result[i][0] = 0;					
				} else {
					result[i][0] = result[i-1][0];
				}
			}
			for(int i = 1; i < y; i++){
				if( result[0][i] == -1 ){
					result[0][i] = 0;					
				} else {
					result[0][i] = result[0][i-1];
				}
			}
			for(int i = 1; i < x; i++){
				for(int j = 1; j < y; j++){
					if( result[i][j] == -1 ){
						result[i][j] = 0;
					} else {
						result[i][j] = result[i-1][j] + result[i][j-1];
					}
				}
			}
			ans[index] = result[x-1][y-1];
			index++;
			
			x = stdIn.nextInt();
			y = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(ans[i]);
		}
	}
}
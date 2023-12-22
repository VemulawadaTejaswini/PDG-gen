import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r, c;
		int i, j;
		int[][] sheet = new int[101][101];
		
		for(i = 0; i < 101; i++){
			for(j = 0; j < 101; j++){
				sheet[i][j] = 0;
			}
		}
		
		r = sc.nextInt();
		c = sc.nextInt();
		
		for(i = 0; i < r; i++){
			for(j = 0; j < c; j++){
				sheet[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i < r; i++){
			for(j = 0; j < c; j++){
				sheet[i][c] += sheet[i][j];
			}
		}
		
		for(j = 0; j <= c; j++){
			for(i = 0; i < r; i++){
				sheet[r][j] += sheet[i][j];
			}
		}
		
		for(i = 0; i <= r; i++){
			for(j = 0; j <= c; j++){
				System.out.print(sheet[i][j]);
				
				if(j < c){
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
}
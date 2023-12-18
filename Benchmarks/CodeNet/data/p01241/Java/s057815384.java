import java.util.Scanner;
import java.util.Arrays;



public class Main {

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(int i = 1;; i++){
			int N = scan.nextInt();
			int M = scan.nextInt();
			if((N|M) == 0) {
				break;
				
			} else {}
			
			int[][] cons = new int[2][M+1];
			cons[0][0] = N;
			
			for(int x = 1,t = 1 ;; t++, x = 1 - x){
				
				Arrays.fill(cons[x], 0);
				
				for(int j = 0;i < M; j++){
					
					cons[x][j + 1]+= cons[1 - x][j]/2;
					
					cons[x][0] += cons[1 - x][j]/2;
					
					cons[x][j] += cons[1 - x][j] - cons[1 - x][j]/2*2;
				}
				
				if(cons[x][M] != 0){
					System.out.println("Case " + i + ": " + t);
					break;
				
				}
			}
		}
		
	}
}

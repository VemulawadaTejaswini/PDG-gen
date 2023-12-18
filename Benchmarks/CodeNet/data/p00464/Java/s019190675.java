import java.util.*;

public class Main{
	int h,w,n;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [][] dp = new int[1000+1][1000+1];
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt() ;
			if((h|w|n) == 0) break;
			n--;
			int [][] inputroad = new int[h+1][w+1];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					inputroad[i][j] = sc.nextInt();
					dp[i][j] = 0;
				}
				inputroad[i][w] = -1;
				dp[i][w] = 0;
			}
			for(int i = 0; i <= w; i++){
				inputroad[h][i] = -1;
				dp[h][i] = 0;
			}
			
			dp[0][0] = n;
			int indI = 0, indJ = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					dp[i][j+1] += dp[i][j] / 2;
					dp[i+1][j] += dp[i][j] / 2;
					if(dp[i][j] %2 == 1){
						if(inputroad[i][j] == 0){
							dp[i+1][j]++;
						}
						else{
							dp[i][j+1]++;
						}
						inputroad[i][j] = (inputroad[i][j] + 1) % 2;
					}
					
					if(i == indI && j == indJ){
						if(inputroad[indI][indJ] == 0){
							indI++;
						}
						else{
							indJ++;
						}
					}
					
				}
			}
			System.out.println((indI + 1) + " " + (indJ + 1));
			
			//debug
//			for(int i = 0; i <= h; i++){
//				for(int j = 0; j <= w; j++){
//					System.out.print(dp[i][j] + " " );
//				}
//				System.out.println();
//			}
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}
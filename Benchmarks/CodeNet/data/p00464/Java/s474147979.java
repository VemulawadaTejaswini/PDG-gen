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
				}
				inputroad[i][w] = -1;
				Arrays.fill(dp[i], 0);
			}
			Arrays.fill(inputroad[h], -1);
			Arrays.fill(dp[h], 0);
			
			dp[0][0] = n;
			int indI = 0, indJ = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					int temp = dp[i][j] / 2;
					dp[i][j+1] += temp;
					dp[i+1][j] += temp;
					if((dp[i][j] & 1) != 0){
						if(inputroad[i][j] == 0){
							dp[i+1][j]++;
						}
						else{
							dp[i][j+1]++;
						}
						inputroad[i][j] = inputroad[i][j] ^ 1;
					}
					
					if(i == indI && j == indJ){
						if(inputroad[i][j] == 0){
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
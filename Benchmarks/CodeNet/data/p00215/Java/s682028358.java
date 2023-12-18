import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	public static final int MAX = 1001; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] monstars_x = new int[5][MAX];
		int[][] monstars_y = new int[5][MAX];
		int[] monstars_count = new int[5];
		int[][] monstars_dp = new int[4][MAX];
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int s_x = -1, s_y = -1, g_x = -1, g_y = -1;
			
			Arrays.fill(monstars_count, 0);
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if('0' <= input[j] && input[j] <= '9'){
						final int type = (int)(input[j] - '0') - 1;
						monstars_x[type][monstars_count[type]] = j;
						monstars_y[type][monstars_count[type]] = i;
						monstars_count[type]++;
					}else if('S' == input[j]){
						s_x = j;
						s_y = i;
					}else if('G' == input[j]){
						g_x = j;
						g_y = i;
					}
				}
			}
			
			int min_count = INF;
			int min_hand = INF;
			
			for(int start = 0; start < 5; start++){
				for(int count = 0; count < 4; count++){
					Arrays.fill(monstars_dp[count], INF);
				}
				
				for(int dp = 0; dp < 4; dp++){
					final int cur_type = (start + dp + 1) % 5;
					final int prev_type = (start + dp) % 5;
					
					//System.out.println(cur_type);
					
					for(int cur = 0; cur < monstars_count[cur_type]; cur++){
						if(dp == 0){
							monstars_dp[dp][cur] = Math.abs(s_x - monstars_x[cur_type][cur]) + Math.abs(s_y - monstars_y[cur_type][cur]);
						}else{
							for(int prev = 0; prev < monstars_count[prev_type]; prev++){
								monstars_dp[dp][cur] = Math.min(
										monstars_dp[dp][cur],
										monstars_dp[dp-1][prev] + 
										Math.abs(monstars_x[cur_type][cur] - monstars_x[prev_type][prev]) +
										Math.abs(monstars_y[cur_type][cur] - monstars_y[prev_type][prev])); 
										
							}
						}
					}
				}
				/*
				for(int i = 0; i < 4; i++){
					System.out.println(Arrays.toString(monstars_dp[i]));
				}
				*/
				final int last = (start + 4) % 5;
				for(int result = 0; result < monstars_count[last]; result++){
					final int cost = monstars_dp[3][result] + Math.abs(g_x - monstars_x[last][result]) + Math.abs(g_y - monstars_y[last][result]);
					
					//System.out.print(cost + ", ");
					
					if(cost < min_count){
						min_count = cost;
						min_hand = start + 1;
					}
				}
				
				//System.out.println();
				//System.out.println("----------------------------------------------------");
			}
			
			if(min_count >= INF){
				System.out.println("NA");
			}else{
				System.out.println(min_hand + " " + min_count);
			}
		}
	}
}
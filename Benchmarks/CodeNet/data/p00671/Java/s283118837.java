import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int MAX_AREA = 15;
	public static final int MAX_DAY  = 30;
	public static final int MAX_COST = 50;
	public static final int MAX_DOBL = 5;
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static final int[] next_dir = {-1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] benefits = new int[MAX_AREA][MAX_DAY];
		int[][] costs    = new int[MAX_AREA][MAX_DAY];
		
		//75 * 15 = 375 + 750 => 1100 > 110000
		//15 * 30 * 50 * 5 => 75 * 1500 => 
		//int[][][][] DP = new int[MAX_AREA][MAX_DAY + 1][MAX_DOBL + 1][MAX_COST + 1];
		int[][][] DP = new int[MAX_DAY + 1][MAX_DOBL + 1][MAX_COST + 1];
		
		while(true){
			final int C = sc.nextInt();
			final int D = sc.nextInt();
			final int W = sc.nextInt();
			final int X = sc.nextInt();
			
			if(C == 0 && D == 0 && W == 0 && X == 0){
				break;
			}
			
			for(int i = 0; i < C; i++){
				for(int j = 0; j < D; j++){
					benefits[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < C; i++){
				for(int j = 0; j < D; j++){
					costs[i][j] = sc.nextInt();
				}
			}
			
			for(int j = 0; j <= D; j++){
				for(int k = 0; k <= X; k++){
					for(int l = 0; l <= W; l++){
						DP[j][k][l] = -1;
					}
				}
			}
			
			DP[0][0][0] = 0;
			
			// arrival
			for(int day = 0; day < D; day++){
				for(int prev = 0; prev <= X; prev++){
					for(int cost = 0; cost <= W; cost++){
						if(DP[day][prev][cost] < 0){
							continue;
						}
						final int cur_benefit = DP[day][prev][cost];
						
						//do-nothing
						DP[day + 1][prev][cost] = Math.max(DP[day + 1][prev][cost], cur_benefit);				
						
						for(int area = 0; area < C; area++){
							final int next_cost = cost + costs[area][day];
							final int next_benefit = cur_benefit + benefits[area][day];
							
							if(next_cost > W){
								continue;
							}else if(benefits[area][day] == 0){
								continue;
							}
							
							//System.out.println(day + " " + area + " " + next_benefit);
							
							DP[day + 1][prev][next_cost]
								= Math.max(DP[day + 1][prev][next_cost], 
										next_benefit);
							
							if(prev != X){
								for(int d : next_dir){
									int nn_cost = next_cost;
									int next_area = area;
									int nn_benefit = next_benefit;
									
									while(true){
										next_area += d;
										
										if(next_area >= C || next_area < 0){
											break;
										}
										
										nn_cost += costs[next_area][day];
										
										if(nn_cost > W){
											break;
										}else if(benefits[next_area][day] == 0){
											break;
										}
										
										nn_benefit += benefits[next_area][day];
										
										DP[day + 1][prev + 1][nn_cost]
												= Math.max(DP[day + 1][prev + 1][nn_cost], 
														nn_benefit);
									}
								}
							}
						}
					}
				}
			}
			
			int max = 0;
			for(int day = 0; day <= D; day++){
				for(int prev = 0; prev <= X; prev++){
					for(int cost = 0; cost <= W; cost++){
						max = Math.max(max, DP[day][prev][cost]);
					}
				}
			}
			
			System.out.println(max);
		}
		
		sc.close();
	}
}
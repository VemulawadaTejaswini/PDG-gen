import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	public static final int M_MAX = 6;
	public static final int N_MAX = 100;
	public static final int MAX = M_MAX + N_MAX + 3;
	
	public static int node_num(int n, int m, String in){
		//System.out.println(in);
		
		// 0 => home
		// 1 to m => cake
		// m + 1 to n + m + 1 => Landmark
		// n + m + 2 => goal
		
		if("H".equals(in)){
			return 0;
		}else if("D".equals(in)){
			return n + m + 2;
		}else{
			return Integer.parseInt(in.substring(1)) + (in.charAt(0) == 'L' ? m : 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] adj = new int[MAX][MAX];
		int[][] cal_array  = new int[MAX][1 << M_MAX];
		
		while(true){
			final int m = sc.nextInt();
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int d = sc.nextInt();
			
			if(n == 0 && m == 0 && k == 0 && d == 0){
				break;
			}
			
			final int max    = n + m + 3; 
			final int home   = 0;
			final int arrive = n + m + 2;
			
			int[] cals = new int[m + 2];
			for(int i = 0; i < m; i++){
				cals[i + 1] = sc.nextInt();
			}
			
			for(int i = 0; i < max; i++){
				for(int j = 0; j < max; j++){
					adj[i][j] = i == j ? 0 : INF;
				}
			}
			
			for(int i = 0; i < d; i++){
				String in1 = sc.next();
				String in2 = sc.next();
				
				//System.out.println(in1 + " " + in2);
				
				final int from = node_num(n, m, in1);
				final int to   = node_num(n, m, in2);
				
				//System.out.println(from + " " + to);
				
				final int dist = sc.nextInt();
				
				adj[from][to] = adj[to][from] = Math.min(adj[from][to], dist * k);
			}
			
			/*
			for(int i = 0; i < max; i++){
				for(int j = 0; j < max; j++){
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			
			for(int i = 0; i < max; i++){
				Arrays.fill(cal_array[i], INF);
			}
			
			final int m_bit = 1 << m;
			cal_array[0][0] = 0;
			while(true){
				boolean updated = false;
				
				for(int place = 0; place < max; place++){
					for(int bit = 0; bit < m_bit; bit++){
						if(cal_array[place][bit] >= INF){
							continue;
						}
						
						//System.out.println(Integer.toBinaryString(bit));
						
						for(int next = 0; next < max; next++){
							if(place == next){
								continue;
							}else if(adj[place][next] >= INF){
								continue;
							}
							
							if(home < next  && next <= m){
								if((bit & (1 << (next - 1))) != 0){
									continue;
								}
								
								final int cost = 
										cal_array[place][bit] + 
										adj[place][next] - cals[next];
								
								if(cal_array[next][bit | (1 << (next - 1))] > cost){
									updated = true;
									cal_array[next][bit | (1 << (next - 1))] = cost;
								}
							}else{
								final int cost = 
										cal_array[place][bit] + 
										adj[place][next];
								
								if(cal_array[next][bit] > cost){
									updated = true;
									cal_array[next][bit] = cost;
								}
							}
							
						}
					}
				}
				
				//for(int i = 0; i < n; i++){
				//	System.out.println(Arrays.toString(cal_array[i]));
				//}
				
				if(!updated){
					break;
				}
			}
			
			System.out.println(cal_array[arrive][m_bit - 1]);
		}
	}
}
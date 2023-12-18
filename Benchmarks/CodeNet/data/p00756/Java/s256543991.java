import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static boolean is_covered(int node, int bit, boolean[][] adj){
		for(int upper = node - 1; upper >= 0; upper--){
			if((bit & (1 << upper)) != 0){
				continue;
			}else if(adj[upper][node]){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			System.gc();
			
			if(n == 0){
				break;
			}
			
			int[] x_pos  = new int[n];
			int[] y_pos  = new int[n];
			int[] rs     = new int[n];
			int[] colors = new int[n];
			
			for(int i = 0; i < n; i++){
				x_pos[i]  = sc.nextInt();
				y_pos[i]  = sc.nextInt();
				rs[i]     = sc.nextInt();
				colors[i] = sc.nextInt();
			}
			
			boolean[][] cover = new boolean[n][n];
			
			for(int upper = 0; upper < n; upper++){
				for(int lower = upper + 1; lower < n; lower++){
					final int x_diff = (x_pos[upper] - x_pos[lower]);
					final int y_diff = (y_pos[upper] - y_pos[lower]);
					final int r_diff = (rs[upper] + rs[lower]);
					
					if(x_diff * x_diff + y_diff * y_diff < r_diff * r_diff){
						cover[upper][lower] = true;
					}
				}
			}
			
			final int bit_max = 1 << n;
			
			int[] dp = new int[bit_max];
			Arrays.fill(dp, -1);
			dp[0] = 0;
			
			int max = 0;
			for(int bit = 0; bit < bit_max; bit++){
				if(dp[bit] < 0){
					continue;
				}else{
					max = Math.max(max, dp[bit]);
				}
				
				//System.out.println(dp[bit]);
				
				for(int left = 0; left < n; left++){
					if((bit & (1 << left)) != 0){
						continue;
					}else if(is_covered(left, bit, cover)){
						continue;
					}
					//System.out.println("come");
					
					for(int right = left + 1; right < n; right++){
						if((bit & (1 << right)) != 0){
							continue;
						}else if(is_covered(right, bit, cover)){
							continue;
						}else if(colors[left] != colors[right]){
							continue;
						}
						
						final int next_bit = ((bit | (1 << left)) | (1 << right));
						//System.out.println(next_bit);
						
						dp[next_bit] = Math.max(dp[next_bit], dp[bit] + 2);
					}
				}
			}
			
			System.out.println(max);
		}
	}
}
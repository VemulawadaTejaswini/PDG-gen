import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static boolean is_not_covered(final int n, final int purpos, int[] x_array, int[] y_array, int[] r_array, int bit){	
		for(int j = 0; j < n; j++){
			if((bit & (1 << j)) == 0){
				continue;
			}else if(purpos == j){
				continue;
			}
		
			final int diff_x = (x_array[purpos] - x_array[j]) * (x_array[purpos] - x_array[j]);
			final int diff_y = (y_array[purpos] - y_array[j]) * (y_array[purpos] - y_array[j]);
			final int diff_r = (r_array[purpos] + r_array[j]) * (r_array[purpos] + r_array[j]);
				
			if(diff_x + diff_y < diff_r && purpos > j){
				//System.out.println(purpos + " " + j);
				return false;
			}
		}
		
		//System.out.println("ok");
		
		return true;
	}
	
	public static int dfs(int bit, final int n, int[] x_array, int[] y_array, int[] r_array, int[] c_array, int[] memo){
		if(memo[bit] >= 0){
			return memo[bit];
		}
		
		//System.out.println(Integer.toBinaryString(bit));
		
		int max = 0;
		
		for(int i = 0; i < n; i++){
			if((bit & (1 << i)) == 0){
				continue;
			}
			
			for(int j = i + 1; j < n; j++){
				if((bit & (1 << j)) == 0){
					continue;
				}else if(c_array[i] != c_array[j]){
					continue;
				}else if(is_not_covered(n, i, x_array, y_array, r_array, bit) && is_not_covered(n, j, x_array, y_array, r_array, bit)){
					final int next_bit = (bit & (~(1 << i))) & (~(1 << j));
					
					//System.out.println(bit + " => " + next_bit);
					
					max = Math.max(max, dfs(next_bit, n, x_array, y_array, r_array, c_array, memo) + 2);
				}
			}
		}
		
		return memo[bit] = max;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] x_array = new int[n];
			int[] y_array = new int[n];
			int[] r_array = new int[n];
			int[] c_array = new int[n];
			
			for(int i = 0; i < n; i++){
				x_array[i] = sc.nextInt();
				y_array[i] = sc.nextInt();
				r_array[i] = sc.nextInt();
				c_array[i] = sc.nextInt();
			}
			
			int[] memo = new int[1 << n];
			Arrays.fill(memo, -1);
			
			System.out.println(dfs((1 << n) - 1, n, x_array, y_array, r_array, c_array, memo));
		}
	}

}
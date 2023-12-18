import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static String connect(String pre, String post){
		char[] pre_array = pre.toCharArray();
		char[] post_array = post.toCharArray();
		
		int min = Math.min(pre_array.length, post_array.length);
		
		int over = 0;
		for(int range = 0; range <= min; range++){
			boolean flag = true;
			for(int pos = 0; pos < range; pos++){
				//System.out.println(pre_array[pre_array.length - (range - pos)] + " " + post_array[pos]);
				
				if(pre_array[pre_array.length - (range - pos)]
					!= post_array[pos]){
						flag = false;
						break;
					}
			}
			
			//System.out.println(range);
			
			if(flag){
				over = Math.max(over, range);
			}
		}
		
		//System.out.println(pre+ " " + post.substring(over));
		
		return pre.concat(post.substring(over));
	}
	
	public static final int MAX = 14;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] dp = new String[1 << MAX][MAX];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			System.gc();
			
			ArrayList<String> array_list = new ArrayList<String>();
			
			for (int i = 0; i < N; i++) {
				array_list.add(sc.next());
			}
			
			ArrayList<String> no_dup_list = new ArrayList<String>();
			for(int i = 0; i < N; i++){
				String left = array_list.get(i);
				boolean flag = false;
				
				for(int j = 0; j < N; j++){	
					if(i == j){
						continue;
					}
					
					String right = array_list.get(j);
					
					if(right.indexOf(left) > 0){
						flag = true;
						break;
					}else if(right.indexOf(left) == 0 && no_dup_list.contains(left)){
						flag = true;
						break;
					}
				}
				
				if(!flag){
					no_dup_list.add(left);
				}
			}
			
			//System.out.println(no_dup_list);
			
			String[] array = new String[no_dup_list.size()];
			for(int i = 0; i < no_dup_list.size(); i++){
				array[i] = no_dup_list.get(i);
			}
			
			Arrays.sort(array);
			//System.out.println(Arrays.toString(array));
			
			final int n = array.length;
			
			final int limit = 1 << n;
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < n; i++){
					dp[S][i] = null;
				}
			}
			
			for(int i = 0; i < n; i++){
				dp[0][i] = "";
				dp[1 << i][i] = array[i];
			}
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < n; i++){
					if((S & (1 << i)) == 0){
						continue;
					}else if(dp[S][i] == null){
						continue;
					}
					
					for(int j = 0; j < n; j++){
						if((S & (1 << j)) != 0){
							continue;
						}
						
						//System.out.println("[" + Integer.toBinaryString(S) + " " + i + "] " + dp[S][i] + " " + array[j]);
						final String consist = connect(dp[S][i], array[j]);
						
						if(dp[S | (1 << j)][j] == null ||
								dp[S | (1 << j)][j].length() > consist.length()){
							dp[S | (1 << j)][j] = consist;
						}else if(dp[S | (1 << j)][j].length() == consist.length()){
							if(dp[S | (1 << j)][j].compareTo(consist) > 0){
								 dp[S | (1 << j)][j] = consist;
							}
						}
					}
				}
			}
			
			String min_string = null;
			for(int i = 0; i < n; i++){
				if(min_string == null){
					min_string = dp[limit-1][i];
				}else if(min_string.length() > dp[limit - 1][i].length()){
					min_string = dp[limit-1][i];
				}else if(min_string.length() == dp[limit - 1][i].length()){
					if(min_string.compareTo(dp[limit - 1][i]) > 0){
						min_string = dp[limit-1][i];
					}
				}
			}
			
			System.out.println(min_string.length());
		}

		sc.close();
	}

}
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		int[] costs = new int[n];
		for(int i = 0; i < n; i++){
			costs[i] = sc.nextInt();
		}
		
		int[] votes = new int[m];
		for(int i = 0; i < m; i++){
			votes[i] = sc.nextInt();
		}
		
		int[] count = new int[n];
		for(int i = 0; i < m; i++){
			final int lim_cost = votes[i];
			
			int selected = -1;
			for(int j = 0; j < n; j++){
				if(costs[j] <= lim_cost){
					selected = j;
					break;
				}
			}
			
			count[selected]++;
		}
		
		int max = -1, max_pos = -1;
		for(int i = 0; i < n; i++){
			if(max < count[i]){
				max = count[i];
				max_pos = i;
			}
		}
		
		System.out.println(max_pos + 1);
	}

}
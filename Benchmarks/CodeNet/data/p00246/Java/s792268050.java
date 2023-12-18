import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int[][] col = 
		{
			{1,1,1,1,1,1,1,1,1,1},
			{2,1,1,1,1,1,1,1,1},
			{2,2,1,1,1,1,1,1},
			{2,2,2,1,1,1,1},
			{2,2,2,2,1,1},
			{2,2,2,2,2},
			{3,1,1,1,1,1,1,1},
			{3,2,1,1,1,1,1},
			{3,2,2,1,1,1},
			{3,2,2,2,1},
			{3,3,1,1,1,1},
			{3,3,2,1,1},
			{3,3,2,2},
			{3,3,3,1},
			{4,1,1,1,1,1,1},
			{4,2,1,1,1,1},
			{4,2,2,1,1},
			{4,2,2,2},
			{4,3,1,1,1},
			{4,3,2,1},
			{4,3,3},
			{4,4,1,1},
			{4,4,2},
			{5,1,1,1,1,1},
			{5,2,1,1,1},
			{5,2,2,1},
			{5,3,1,1},
			{5,3,2},
			{5,4,1},
			{6,1,1,1,1},
			{6,2,1,1},
			{6,2,2},
			{6,3,1},
			{7,1,1,1},
			{7,2,1},
			{8,1,1}
		};
	
	public static int dps(int selected, int[] weight){
		int max = 0;
		
		for(int i = selected; i < col.length; i++){
			boolean ok = true;
			
			for(int cost : col[i]){
				weight[cost]--;
			}
			
			for(int j = 0; j < 10; j++){
				if(weight[j] < 0){
					ok = false;
					break;
				}
			}
			
			if(ok){
				max = Math.max(max, dps(i, weight) + 1);
			}
			
			for(int cost : col[i]){
				weight[cost]++;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] weights = new int[11];
			
			for(int i = 0; i < n; i++){
				weights[sc.nextInt()]++;
			}
			
			int count = 0;
			
			count += weights[5] / 2;
			weights[5] %= 2;
			for(int i = 1; i < 5; i++){
				int min = Math.min(weights[5 + i], weights[5 - i]);
				
				count += min;
				weights[5 + i] -= min;
				weights[5 - i] -= min;
			}
			
			//System.out.println(Arrays.toString(weights));
			System.out.println(count + dps(0, weights));
			
		}
	}

}
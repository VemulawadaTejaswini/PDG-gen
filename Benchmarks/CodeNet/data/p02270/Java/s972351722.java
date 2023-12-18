
import java.util.Scanner;

// this solves the allocation problem with a bin search


public class Main {
	public static boolean is_possible(int[] weights, int q, int k) {
		int current_load = 0;
		int truck_count = 0;
		int i = 0;
		while(i < weights.length) {
			if(current_load + weights[i] > q) {
				truck_count++;
				if(truck_count >= k) {
					break;
				}
				current_load = 0;
			}
			
			current_load += weights[i];
			i++;
		}
		
		truck_count ++;
		return (truck_count <= k);
		
		
		
	}
	
	
	public static int min_q(int[] weights, int k, int sum, int max_val) {
		int lo = max_val;
		int hi = sum;
		int mid = 0;
		
		while(lo <= hi) {
			if(hi == lo) {
				return hi;
			}
			
			mid = (hi + lo) >> 1;
			if(is_possible(weights, mid, k)) {
				hi = mid;
			}else {
				lo = mid+1;
			}
		}
		
		return mid;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		int sum = 0;
		int max_val = 0;
		
		int [] weights = new int[n];
		for(int i = 0; i < n; i++) {
			weights[i] = cin.nextInt();
			sum += weights[i];
			max_val = Math.max(max_val, weights[i]);
		}
		
		System.out.println(min_q(weights, k, sum, max_val));
		
		cin.close();
		
		
	}
}
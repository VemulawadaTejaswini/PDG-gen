import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			
			if(n == 0 && p == 0 && q == 0){
				break;
			}
			
			final int start_min = p / 100 * 60 + p % 100;
			final int end_min = q / 100 * 60 + q % 100;
			
			final int size = end_min - start_min;
			
			int[] interval = new int[size];
			
			for(int i = 0; i < n; i++){
				final int k = sc.nextInt();
				
				for(int j = 0; j < k; j++){
					final int c_p = sc.nextInt();
					final int c_e = sc.nextInt();
					
					final int c_start = (c_p / 100 * 60 + c_p % 100) - start_min;
					final int c_end = (c_e / 100 * 60 + c_e % 100) - start_min;
					
					interval[c_start]++;
					if(c_end < size){
						interval[c_end]--;
					}
				}
			}
			
			for(int t = 1; t < size; t++){
				interval[t] += interval[t-1];
			}
			//System.out.println(Arrays.toString(interval));
			
			int cur = 0;
			int max = 0;
			for(int i = 0; i < size; i++){
				if(interval[i] != n){
					cur++;
				}else{
					max = Math.max(max, cur);
					cur = 0;
				}
			}
			max = Math.max(max, cur);
			
			System.out.println(max);
		}

	}

}
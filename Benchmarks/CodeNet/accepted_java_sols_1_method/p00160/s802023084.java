
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scales = {60, 80, 100, 120, 140, 160};
		int[] weights = {2, 5, 10, 15, 20, 25};
		int[] prices = {600, 800, 1000, 1200, 1400, 1600};
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int sum = 0;
			
			for(int i = 0; i < N; i++){
				final int s = sc.nextInt() + sc.nextInt() + sc.nextInt();
				final int w = sc.nextInt();
				
				int rank = Integer.MIN_VALUE;
				
				boolean found = false;
				for(int j = 0; j < scales.length; j++){
					if(s <= scales[j]){
						rank = Math.max(rank, j);
						found = true;
						break;
					}
				}
				
				if(!found){
					continue;
				}
				
				found = false;
				for(int j = 0; j < weights.length; j++){
					if(w <= weights[j]){
						rank = Math.max(rank, j);
						found = true;
						break;
					}
				}
				
				if(!found){
					continue;
				}
				
				
				if(rank < prices.length){
					sum += prices[rank];
				}
			}
			
			System.out.println(sum);
			
		}
		
	}

}
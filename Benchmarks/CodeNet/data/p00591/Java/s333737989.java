import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] count = new int[10001];
			int[][] data = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++){
				int min = Integer.MAX_VALUE;
				
				for(int j = 0; j < n; j++){
					min = Math.min(min, data[i][j]);
				}
				
				count[min]++;
			}
			
			for(int i = 0; i < n; i++){
				int max = Integer.MIN_VALUE;
				
				for(int j = 0; j < n; j++){
					max = Math.max(max, data[j][i]);
				}
				
				count[max]++;
			}
			
			boolean found = false;
			for(int i = 0; i <= 10000; i++){
				if(count[i] == 2){
					System.out.println(i);
					found = true;
					break;
				}
			}
			
			if(!found){
				System.out.println(0);
			}
		}

	}

}
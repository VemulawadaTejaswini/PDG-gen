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
			
			int[][] count = new int[n][n];
			int[][] data = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++){
				int min = Integer.MAX_VALUE;
				int min_j = -1;
				
				for(int j = 0; j < n; j++){
					if(min > data[i][j]){
						min = data[i][j];
						min_j = j;
					}
				}
				
				count[i][min_j]++;
			}
			
			for(int i = 0; i < n; i++){
				int max = Integer.MIN_VALUE;
				int max_j = -1;
				
				for(int j = 0; j < n; j++){
					if(max < data[j][i]){
						max = data[j][i];
						max_j = j;
					}
				}
				
				count[max_j][i]++;
			}
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(count[i][j] >= 2 && max < data[i][j]){
						max = data[i][j];
					}
				}
			}
			
			if(max == Integer.MAX_VALUE){
				System.out.println(0);
			}else{
				System.out.println(max);
			}
		}

	}

}
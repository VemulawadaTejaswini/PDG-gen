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
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			final int MAX = 1 << n;
			int min = Integer.MAX_VALUE;
			for(int bit = 0; bit < MAX; bit++){
				int sum1 = 0, sum2 = 0;
				
				for(int i = 0; i < n; i++){
					if((bit & (1 << i)) != 0){
						sum1 += array[i];
					}else{
						sum2 += array[i];
					}
				}
				
				min = Math.min(min, Math.abs(sum1 - sum2));
			}
			
			System.out.println(min);
		}
	}

}
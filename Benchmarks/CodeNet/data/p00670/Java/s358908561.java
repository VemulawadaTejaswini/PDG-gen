import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int S = sc.nextInt();
			
			if(n == 0 && S == 0){
				break;
			}
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int count = 0;
			
			for(int i = n - 1; i >= 0; i--){
				for(int j = i - 1; j >= 0; j--){
					if(array[i] + array[j] <= S){
						break;
					}else{
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

}
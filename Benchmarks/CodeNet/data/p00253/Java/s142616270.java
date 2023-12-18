import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] array = new int[n + 1];

			for(int i = 0; i <= n; i++){ 
				array[i] = sc.nextInt();
			}
			
			LOOP:
			for(int i = 0; i <= n; i++){
				int prev = Integer.MIN_VALUE;
				int diff = Integer.MIN_VALUE;
				
				for(int j = 0; j <= n; j++){
					if(i == j){
						continue;
					}else if(prev == Integer.MIN_VALUE){
						prev = array[j];
						continue;
					}else if(diff == Integer.MIN_VALUE){
						diff = array[j] - prev;
					}else{
						if(diff != array[j] - prev){
							continue LOOP;
						}
					}
					
					prev = array[j];
				}
				
				System.out.println(array[i]);
				break;
			}
		}
		
		sc.close();
	}
}
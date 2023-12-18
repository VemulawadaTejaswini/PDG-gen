import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int m = sc.nextInt();
			
			if(m == 0){
				break;
			}
			
			
			int[] numbers = new int[m];
			int[] cards = new int[m];
			
			for(int i = 0; i < m; i++){
				numbers[i] = sc.nextInt();
				cards[i] = sc.nextInt();
			}
			
			
			int[] combs = new int[1001];
			combs[0] = 1;
			
			for(int type = 0; type < m; type++){
				for(int i = 1000; i >= 0; i--){
					if(combs[i] > 0){
						for(int j = 1; j <= cards[type]; j++){
							if((i + j * numbers[type]) <= 1000){
								combs[i + j * numbers[type]] += combs[i];
							}
						}
					}
				}
			}
			
			
			final int n = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				System.out.println(combs[sc.nextInt()]);
			}
		}
		
	}
}
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		final int[] coins = {1000, 500, 100};
		
		while(true){
			final int price = sc.nextInt(), pay = sc.nextInt();
			
			if(price == 0 && pay == 0){
				break;
			}
			
			int diff = pay - price;
			
			int count[] = new int[3];
			
			for(int i = 0; i < 3; i++){
				while(diff >= coins[i]){
					diff -= coins[i];
					count[i]++;
				}
			}
			
			System.out.println(count[2] + " " + count[1] + " " + count[0]);
			
		}
		
	}
}	
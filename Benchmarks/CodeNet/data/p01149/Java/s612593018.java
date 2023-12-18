import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int hand(int con, char[] array, boolean ace){
		int sum = 0;
		
		for(int i = 0; i < con; i++){
			if(array[i] == 'T' || array[i] == 'J' || array[i] == 'Q' || array[i] == 'K'){
				sum += 10;
			}else if(array[i] == 'A'){
				sum += (ace ? 11 : 1);
			}else if('0' <= array[i] && array[i] <= '9'){
				sum += array[i] - '0';
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		
		for(int tt = 0; tt < N; tt++){
			char[] hands = new char[10];
			
			for(int i = 0; i < 10; i++){
				hands[i] = sc.next().charAt(0);
			}
			
			if((hands[0] == 'A' && hands[1] == 'J') || (hands[0] == 'J' && hands[1] == 'A')){
				System.out.println("blackjack");
				continue;
			}
			
			int cons = 2;
			while(true){
				if(cons >= 10){
					cons = 9;
					break;
				}
				
				if(hand(cons, hands, true) == 17){
					cons++;
				}else if(Math.min(hand(cons, hands, false), hand(cons, hands, true)) <= 16){
					cons++;
				}else{
					break;
				}
			}
			
			final int hi = hand(cons, hands, true);
			final int lo = hand(cons, hands, false);
			
			if(lo <= 21 && hi <= 21){
				System.out.println(hi);
			}else if(lo <= 21){
				System.out.println(lo);
			}else{
				System.out.println("bust");
			}
		}
	}

}
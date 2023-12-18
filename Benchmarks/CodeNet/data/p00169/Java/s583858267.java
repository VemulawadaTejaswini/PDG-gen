import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String str = sc.nextLine();
			
			if("0".equals(str)){
				break;
			}
			
			String[] strs = str.split(" ");
			
			int[] cards = new int[14];
			for(int i = 0; i < strs.length; i++){
				cards[Integer.parseInt(strs[i])]++;
			}
			
			int card = 0;
			
			for(int i = 2; i <= 13; i++){
				if(cards[i] != 0){
					card += i > 10 ? 10 * cards[i] : i * cards[i];
				}
			}
			
			
			while (cards[1] > 0) {
				if (card + (cards[1] - 1) < 11) {
					card += 11;
					cards[1]--;
				} else {
					card += 1;
					cards[1]--;
				}
			}
			
			if(card > 21){
				System.out.println(0);
			}else{
				System.out.println(card);
			}
			
			
			
			
		}

	}

}
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?

		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		int change = 0;
		int result = 0;
		
		while(sc.hasNextInt()) {
			price = sc.nextInt();
			if(price == 0) break;
			
			change = 1000 - price;
			int c500 = change / 500;
			change = change - 500 * c500;
			int c100 = change / 100;
			change = change - 100 * c100;
			int c50 = change / 50;
			change = change - 50 * c50;
			int c10 = change / 10;
			change = change - 10 * c10;
			int c5 = change / 5;
			change = change - 5 * c5;
			int c1 = change;
			
			result = c500 + c100 + c50 + c10 + c5 + c1;

			
			System.out.println(result);
		}
		
	}

}
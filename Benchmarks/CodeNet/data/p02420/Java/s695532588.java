import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		while(!n.equals("-")){
		    int shuffle_count = Integer.parseInt(sc.nextLine());
		    Queue<Character> cards = new ArrayDeque<>();
		    
		    for(char card: n.toCharArray()){
		        cards.add(card);
		    }
		    
		    for (int i = 0; i < shuffle_count; i++){
		        int shuffle_cards = Integer.parseInt(sc.nextLine());
		        
		        for (int l = 0; l < shuffle_cards; l++){
		            cards.add(cards.poll());
		        }
		    }
		    
		    for (Character card: cards){
		        System.out.print(card);
		    } 
		    
		    System.out.println();
		    
		    n = sc.nextLine();
		}
	}
}

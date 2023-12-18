import java.util.*;

public class Main
{
    final static int number_of_cards = 10;
    final static int max_number = 20;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int card1 = sc.nextInt();
	    int card2 = sc.nextInt();
	    int card3 = sc.nextInt();
	    int sum = card1 + card2;

	    boolean used_card[] = new boolean[number_of_cards + 1];
	    used_card[card1] = true;
	    used_card[card2] = true;
	    used_card[card3] = true;

	    int count = 0;
	    for(int i = 1; i <= number_of_cards; ++i){
		if(!used_card[i] && sum+i <= max_number){
		    ++count;
		}
	    }
	    System.out.println(judge(count));
	}
    }

    private static String judge(int count){
	return ((double)count/(double)(number_of_cards-3) >= 0.5)? "YES" : "NO";
    }
}
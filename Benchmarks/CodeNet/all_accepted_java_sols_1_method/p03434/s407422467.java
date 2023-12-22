import java.util.*;


public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card_count = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < card_count; i++) {
          cards.add(sc.nextInt());
        }
        Collections.sort(cards, Collections.reverseOrder());
        
        int result = 0;
        for (int i = 0; i < card_count; i++) {
        	if (i % 2 == 0) {
        		result += cards.get(i);
        	} else {
        		result -= cards.get(i);
        	}
        }
        System.out.println(result);
    }
}
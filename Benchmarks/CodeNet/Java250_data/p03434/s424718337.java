import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int cards = s.nextInt();
        ArrayList<Integer> card = new ArrayList<Integer>();

        for (int i = 0; i < cards; i++) {
          card.add(s.nextInt());
        }

        // 降順
        Collections.sort(card, Comparator.reverseOrder()); 

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < cards; i++) {
          if(i%2 == 0) {
            alice = alice + card.get(i);
          } else {
            bob = bob + card.get(i);
          }
        }
        System.out.println(alice-bob);
    }
}
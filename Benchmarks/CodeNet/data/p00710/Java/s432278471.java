import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int cardCount = sc.nextInt();
            int cutCount = sc.nextInt();
            if (cardCount == 0 && cutCount == 0) {
                break;
            }

            char[] cards = new char[cardCount];
            for (int i = 0; i < cards.length; i++) {
                cards[i] = (char) (cards.length - i);
            }
            String cardsString = new String(cards);

            int indexStart, cutCardCount, indexEnd;
            String firstCards, midCards, lastCards;
            for (int i = 0; i < cutCount; i++) {
                indexStart = sc.nextInt() - 1;
                cutCardCount = sc.nextInt();
                
                indexEnd = indexStart + cutCardCount;

                firstCards = cardsString.substring(0, indexStart);
                midCards = cardsString.substring(indexStart, indexEnd);
                lastCards = cardsString.substring(indexEnd);

                cardsString = midCards + firstCards + lastCards;
            }

           System.out.println((int)cardsString.charAt(0));

        }
        
        sc.close();
    }
}

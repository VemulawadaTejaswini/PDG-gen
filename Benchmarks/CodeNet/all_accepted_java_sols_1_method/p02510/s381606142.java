import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String cards = scan.next();
            if (cards.equals("-"))
                break;

            int noShuffle = scan.nextInt();
            for (int i = 0; i < noShuffle; i++) {
                int noCards = scan.nextInt();
                cards = cards.substring(noCards, cards.length())
                    + cards.substring(0, noCards);
            }

            System.out.println(cards);
        }
    }
}
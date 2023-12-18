import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String cards = scan.next();
            if (cards.equals("-"))
                break;

            int nShuffles = scan.nextInt();
            for (int i = 0; i < nShuffles; i++) {
                int h = scan.nextInt();
                cards = cards.substring(h, cards.length()) + cards.substring(0, h);
            }

            System.out.println(cards);
        }
    }
}
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    static final char[] suits = {'S', 'H', 'C', 'D'};
    static final int[]  ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> cards = new LinkedHashSet<String>();
        for (char suit : suits)
            for (int rank : ranks)
                cards.add(toCard(suit, rank));

        scan.nextLine(); // to skip n
        while (scan.hasNextLine())
            cards.remove(scan.nextLine());

        for (String card : cards)
            System.out.println(card);
    }

    public static String toCard(char suit, int rank) {
        return suit + " " + rank;
    }
}
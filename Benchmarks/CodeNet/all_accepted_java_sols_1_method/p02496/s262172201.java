import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<String> cards = new LinkedHashSet<String>();

        String[] kinds = {"S", "H", "C", "D"};
        for (String kind: kinds) {
            for (int i = 1; i <= 13; i++) {
                cards.add(kind + " " + i);
            }
        }

        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        while (scan.hasNext()) {
            String card = scan.nextLine();
            cards.remove(card);
        }

        for (String card: cards) {
            System.out.println(card);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String cards = sc.next();

            if (cards.equals("-"))
                break;

            int m = sc.nextInt();
            
            while (m-- > 0) {
                int h = sc.nextInt();
                cards = shuffle(cards, h);
            }

            System.out.println(cards);
        }

    }
    private static String shuffle(String cards, int h) {
        return cards.substring(h) + cards.substring(0, h);
    }
}



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String cards = scanner.next();
            if (cards.equals("-")) break;
            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                int h = scanner.nextInt();
                String head = cards.substring(0, h);
                String tail = cards.substring(h);
                cards = tail.concat(head);
            }
            System.out.println(cards);
        }
        scanner.close();
    }
}


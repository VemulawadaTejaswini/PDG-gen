import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String deck = sc.nextLine();
            if (deck.equals("-")) {
                break;
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                String part1 = deck.substring(h);
                String part2 = deck.substring(0, h);
                deck = part1.concat(part2);
            }
            System.out.println(deck);
            deck = sc.nextLine();
        }
        sc.close();
    }
}

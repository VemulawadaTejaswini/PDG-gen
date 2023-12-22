import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int m, h;
        String deck, temp1, temp2;
        Scanner sc = new Scanner(System.in);
        deck = sc.next();
        
        while (!deck.equals("-")) {
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                h = sc.nextInt();
                temp1 = deck.substring(0, h);
                temp2 = deck.substring(h, deck.length());
                temp2 += temp1;
                deck = temp2;
            }
            System.out.println(deck);
            deck = sc.next();
        }
    }
}

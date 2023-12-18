import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static int[] cards;
    
    public static void main(String[] args) {
        int n;
        while((n = scn.nextInt()) > 0) {
            createCards(n);
            for(int i = scn.nextInt(); i > 0; i--) {
                shuffleCards();
            }
            System.out.println(cards[0]);
        }
    }
    
    private static void createCards(int n) {
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) {
            ary[i] = n - i;
        }
        cards = ary;
    }
    
    private static void shuffleCards() {
        int p = scn.nextInt() - 1, c = scn.nextInt();
        int[] btm = Arrays.copyOfRange(cards, 0, p);
        int[] top = Arrays.copyOfRange(cards, p, p + c);
        System.arraycopy(top, 0, cards, 0, top.length);
        System.arraycopy(btm, 0, cards, top.length, btm.length);
    }
}
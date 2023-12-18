import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Main main = new Main();
        main.ex1();
    }

    private void ex1() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] marks = {"S", "H", "C", "D"};

        ArrayList<Card> cards = new ArrayList<Card>();
        for(int i=0; i<marks.length; i++) {
            for(int rank=1; rank<=13; rank++) {
                Card card = new Card(marks[i], rank);
                cards.add(card);
            }
        }

        for(int i=0; i<num; i++) {
            String mark = scanner.next();
            int rank = scanner.nextInt();
            Card deleteCard = new Card(mark, rank);

            for(int j=0; j<cards.size(); j++) {
                if (deleteCard.toString().equals(cards.get(j).toString())) {
                    cards.remove(j);
                    break;
                }
            }
        }
        
        for(int i=0; i<cards.size(); i++) {
            System.out.println(cards.get(i).toString());
        }
    }

    class Card {
        private String mark = null;
        private int rank = 0;
        public Card(String mark, int rank) {
            this.mark = mark; this.rank = rank;
        }
        public String getMark() { return this.mark; }
        public int getRank() { return this.rank; }
        public String toString() {
            return this.mark + " " + this.rank;
        }
    }

}

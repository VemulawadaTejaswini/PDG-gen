import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] marks = {"S", "H", "C", "D"};

        // all card -> cards
        ArrayList<String> cards = new ArrayList<String>();
        for (int i=0; i<marks.length; i++) {
            for (int j=1; j<=13; j++){
                cards.add(marks[i] + " " + j);
            }
        }
        
        int cardLen = scanner.nextInt();
        
        // remove card from cards
        for (int i=0; i<cardLen; i++) {
            
            String mark = scanner.next();
            int rank = scanner.nextInt();
            String card = mark + " " + rank;
            
            for (int j=0; j<cards.size(); j++) {
                
                if (cards.get(j).equals(card)) {
                    cards.remove(j);
                    break;
                }
                
            }
        }
        
        // display
        for (String card : cards) {
            System.out.println(card);
        }
    }
}

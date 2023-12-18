import java.util.*;

public class Main {
    private static final String[] MARKS = new String[]{"S", "H", "C", "D"};
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCards;
        String mark;  //S, H, C, D
        int number;
        boolean [][] cards = new boolean[4][13];
        
        numberOfCards = scanner.nextInt();
        for (int i = 0; i < numberOfCards; i++) {
            mark = scanner.next();
            number = scanner.nextInt() - 1;
            int markIndex;
            
            if (mark.equals("S")) {
                markIndex = 0;
            } else if (mark.equals("H")) {
                markIndex = 1;
            } else if (mark.equals("C")) {
                markIndex = 2;
            } else if (mark.equals("D")) {
                markIndex = 3;
            } else {
                return;
            }
            cards[markIndex][number] = true;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if(cards[i][j] == false) {
                    System.out.println(MARKS[i] + " " + (j+1));
                }
            }
        }
    }
}
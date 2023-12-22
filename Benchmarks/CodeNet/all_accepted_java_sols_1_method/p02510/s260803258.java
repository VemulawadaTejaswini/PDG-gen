import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String card = scanner.nextLine();
            
            if (card.equals("-")) {
                break;
            }
            int n = Integer.parseInt(scanner.nextLine());
            
            for (int i = 0; i < n; i++) {
                int h = Integer.parseInt(scanner.nextLine());
                String left = card.substring(0, h);
                String right = card.substring(h, card.length());
                String temp = right + left;
                card = temp;
            }
            System.out.println(card);
        }
    }
}
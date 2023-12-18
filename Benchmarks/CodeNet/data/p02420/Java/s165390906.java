import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            String card = s.next();
            if (card.equals("-")) break;
            int m = s.nextInt();
            for (int i=0; i<m; i++){
                int h = s.nextInt();
                String front = card.substring(0,h);
                String back = card.substring(h);
                card = back+front;
            }
            System.out.println(card);
        }
    }
}

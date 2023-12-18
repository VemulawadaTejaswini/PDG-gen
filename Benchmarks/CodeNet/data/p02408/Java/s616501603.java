import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean[][] hasCards = new boolean[4][13];
        String card;
        for (int i = 0; i < n; i++) {
            card = in.next();
            int cardMark = 0;
            if (card.equals("S")){
                cardMark = 0;
            }else if(card.equals("H")){
                cardMark = 1;
            }else if(card.equals("C")){
                cardMark = 2;
            }else if(card.equals("D")){
                cardMark = 3;
            }
            int cardNumber = in.nextInt() -1;

            hasCards[cardMark][cardNumber] = true;
        }

        in.close();

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 13; y++) {
                if (hasCards[x][y] == false) {
                    switch (x) {
                        case 0:
                            System.out.print("S");
                            break;

                        case 1:
                            System.out.print("H");
                            break;

                        case 2:
                            System.out.print("C");
                            break;

                        case 3:
                            System.out.print("D");
                            break;

                        default:
                            break;
                    }
                    System.out.print(" ");
                    System.out.println(y + 1);
                }
            }
        }
    }
}
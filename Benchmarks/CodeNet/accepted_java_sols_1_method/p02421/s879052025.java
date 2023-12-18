import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int taro_point = 0;
        int hanako_point = 0;
        int card_num = 0;
        int result_comp;

        String[] taro_card,hanako_card;

        Scanner sc= new Scanner( System.in );

        card_num = sc.nextInt();

        taro_card = new String[card_num];
        hanako_card = new String[card_num];

        for ( int i = 0 ; i < card_num ; i++ ) {
            taro_card[i] = sc.next();
            hanako_card[i] = sc.next();
        }

        for ( int i = 0 ; i < card_num ; i++ ) {
            result_comp = 0;
            result_comp = taro_card[i].compareTo(hanako_card[i]);

            if ( result_comp < 0 ) {
                hanako_point += 3;
            }else if ( result_comp == 0 ) {
                taro_point ++;
                hanako_point ++;
            }else if ( result_comp > 0 ) {
                taro_point += 3;
            }

        }
        System.out.println( taro_point + " " + hanako_point );
        sc.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] arg){

    ArrayList <String> taro = new ArrayList <String>();
    ArrayList <String> hanako = new ArrayList <String>();
    

    Scanner in = new Scanner(System.in);

    String input = in.nextLine();
    int card_cnt = Integer.parseInt(input);

    for(int i=0; i<card_cnt; i++){
        input = in.nextLine();
        String [] tmp = input.split(" ", 0);
        taro.add(tmp[0]);
        hanako.add(tmp[1]);
    }

    // debug System.out.println(taro.toString());
    // debug System.out.println(hanako.toString());

    int taro_point = 0, hanako_point = 0;

    for(int i=0; i<taro.size(); i++){
        String taro_card = taro.get(i);
        String hanako_card = hanako.get(i);

        // debug System.out.println(taro_card + " " + hanako_card);
        // debug System.out.println(taro_card.compareTo(hanako_card));

        if(taro_card.compareTo(hanako_card) > 0){
            taro_point += 3;
        }
        else if(taro_card.compareTo(hanako_card) < 0){
            hanako_point += 3;
        } else {
            taro_point += 1;
            hanako_point += 1;
        }
        // debug System.out.println(taro_point + " " + hanako_point);

    }

    System.out.println(taro_point + " " + hanako_point);

  }
}
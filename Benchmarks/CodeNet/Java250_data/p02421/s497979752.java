import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{


  public static void main(String[] args){
    int num_turn; //ターン数
    List<String> taro_c = new ArrayList<String>();
    List<String> hanako_c = new ArrayList<String>();

    int taro_p=0;
    int hanako_p=0;


    Scanner scan = new Scanner(System.in);
    num_turn = scan.nextInt();

    for(int i = 0; i < num_turn; i++){
      String taro_w = scan.next();
      taro_c.add(taro_w);
      String hanako_w = scan.next();
      hanako_c.add(hanako_w);

      int judge = taro_w.compareTo(hanako_w);
      //太郎があとなら+3,
      if( judge >= 1 ) taro_p += 3;
      else if( judge == 0 ) {taro_p += 1; hanako_p += 1;}
      else if( judge <= -1) hanako_p += 3;

      judge=0;
    }

    System.out.println(taro_p + " " + hanako_p);


  }

}


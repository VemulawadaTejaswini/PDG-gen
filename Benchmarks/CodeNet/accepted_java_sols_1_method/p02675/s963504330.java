import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      Integer N = Integer.parseInt(sc.next());
      
      String answer;
      int itinokurai = N % 10;
      if(itinokurai == 3){
        answer = "bon";
      }else if(itinokurai == 0 || itinokurai == 1 || itinokurai == 6 || itinokurai == 8){
        answer = "pon";
      }else{
        answer = "hon";
      }
      System.out.println(answer);
    }
}


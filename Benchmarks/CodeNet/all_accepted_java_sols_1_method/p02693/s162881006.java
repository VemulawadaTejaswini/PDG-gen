import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      // List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      int K = Integer.parseInt(sc.next());
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());

      //黒板の整数
      String answer = "NG"; 
      for(int i=1; K*i<=1000; i++){
        if(A <= K*i && B >= K * i){
          answer = "OK";
          break;
        }else {
          answer = "NG";
        }
      }
      System.out.println(answer);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      
      // 判定
      String result = "Yes";
      int allCrane = 2 * X;
      int allTurtle = 4 * X;
      if(Y < allCrane || allTurtle < Y){
        result = "No";
      }else{
        int dif = Y - allCrane;
        if(dif % 2 == 1){
          result = "No";
        }
      }
      
      // 出力
      System.out.println(result);
    }
    

}
import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      
      // 判定
      int result = 0;
      if(x == 0){
        result = 1;
      }
      
      // 出力
      System.out.println(result);
    }

}
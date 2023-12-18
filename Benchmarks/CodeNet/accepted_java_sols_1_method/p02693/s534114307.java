import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      String result = "NG";
      
      // 判定
      for(int i = A; i <= B; i++){
        if(i % K == 0){
          result = "OK";
          break;
        }
      }
      
      // 出力
      System.out.println(result);
    }

}
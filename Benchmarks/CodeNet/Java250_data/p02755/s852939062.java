import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      
      // 条件を満たす値段の探索
      int result = -1;
      for(int i = 0; i < 2000; i++){
        int tax8 = getTax(i, 8);
        int tax10 = getTax(i, 10);
        
        // 条件に一致した場合
        if(tax8 == A && tax10 == B){
          result = i;
          break;
        }
        
      }
      
      // 出力
      System.out.println(result);
    }
    
    // 消費税を計算する関数
    public static int getTax(int base, int rate){
      return base * rate / 100;
    }
    


}
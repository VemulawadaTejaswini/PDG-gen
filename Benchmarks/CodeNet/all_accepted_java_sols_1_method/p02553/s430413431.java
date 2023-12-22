import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      
      // 計算
      long max = a*c;
      if(max < a*d){
        max = a*d;
      }
      if(max < b*c){
        max = b*c;
      }
      if(max < b*d){
        max = b*d;
      }
      
      // 出力
      System.out.println(max);
    }
    
}
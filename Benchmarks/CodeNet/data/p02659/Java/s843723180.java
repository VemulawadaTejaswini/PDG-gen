import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long A = sc.nextLong();
      double B = sc.nextDouble();
      
      // 計算
      long result = 0L;
      long longB = (long)(B * 100);
      
      result = A * longB / 100;
      
      // 出力
      System.out.println(result);
    }
    
}
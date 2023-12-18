import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int L = sc.nextInt();
      int R = sc.nextInt();
      int d = sc.nextInt();
      
      // 算出
      int countL = (L-1) / d;
      int countR = R / d;
      int result = countR - countL;
      
      // 出力
      System.out.println(result);
    }
    
}
import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      
      // 計算
      int num500 = X / 500;
      int remain = X - 500 * num500;
      int num5 = remain / 5;
      int happy = num500 * 1000 + num5 * 5;
      
      // 出力
      System.out.println(happy);
    }
    
}
import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // 7が含まれるか判定
      int work;
      int digit100 = N / 100;
      work = N % 100;
      int digit10 = work / 10;
      int digit1 = work % 10;
      
      String result = "Yes";
      if(digit100 != 7 && digit10 != 7 && digit1 != 7){
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }

}
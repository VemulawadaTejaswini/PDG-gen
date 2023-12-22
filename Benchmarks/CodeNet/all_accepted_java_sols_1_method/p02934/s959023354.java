  import java.util.*;

  public class Main {
      public static void main (String[]args){

          Scanner scanner = new Scanner(System.in);

          // 入力回数の取得
          int N = scanner.nextInt();

          double all = 0;

          for (int i = 0; N > i ; i++) {
            //　入力回数分の数値入力を求め、逆数に変換する
            all +=  1 / scanner.nextDouble();
          }

          // 逆数として出力
          System.out.println(1 / all);
              
      }
  } 
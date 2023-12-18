import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      
      // 判定
      int kyu = 0;
      if(X <= 599){
        kyu = 8;
      }else if(X <= 799){
        kyu = 7;
      }else if(X <= 999){
        kyu = 6;
      }else if(X <= 1199){
        kyu = 5;
      }else if(X <= 1399){
        kyu = 4;
      }else if(X <= 1599){
        kyu = 3;
      }else if(X <= 1799){
        kyu = 2;
      }else if(X <= 1999){
        kyu = 1;
      }
      
      // 出力
      System.out.println(kyu);
    }

}
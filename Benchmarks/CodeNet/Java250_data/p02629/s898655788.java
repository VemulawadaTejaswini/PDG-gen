import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      
      // 命名
      StringBuilder sb = new StringBuilder();
      while(N > 26){
        int amari = (int)(N % 26);
        if(amari == 0){
          amari = 26;
          N -= 26;
        }
        String s = getChar(amari);
        sb.insert(0, s);
        N = N / 26;
      }
      String last = getChar((int)N);
      sb.insert(0, last);
      
      // 出力
      System.out.println(sb.toString());
    }
    
    // 番号の文字をString型で返す関数
    public static String getChar(int num){
      String charList = " abcdefghijklmnopqrstuvwxyz";
      char c = charList.charAt(num);
      
      return String.valueOf(c);
    }

}
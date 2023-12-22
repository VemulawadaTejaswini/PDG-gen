import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      String word  = sc.next();
      
      // 先頭文字を抜き出す
      String top = word.substring(0,1);
      
      // 末尾文字を抜き出す
      String end = word.substring(word.length() -1);
      
      // 先頭と末尾の間の文字数を抜き出す
      int s = word.length() -2;
      
      System.out.println(top + s + end);
    }
}
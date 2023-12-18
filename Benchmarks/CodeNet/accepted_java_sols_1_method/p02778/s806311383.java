import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int N = S.length();
    String[] split = S.split("");
    //文字置き換え
    for (int i = 0; i < N ; i++) {
      split[i] = "x";
    }
    //文字列に直す
    StringJoiner T = new StringJoiner("");
    for (String s : split) {
      T.add(s);
    }
    System.out.println(T.toString());      
  }
}
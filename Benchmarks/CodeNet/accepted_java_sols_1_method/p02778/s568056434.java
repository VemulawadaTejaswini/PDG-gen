import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力
    String s = sc.next(); 
    
    // 出力
    for(int i=0; i<s.length(); ++i)
      System.out.print("x");
  }
}
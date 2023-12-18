import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力
    String s = sc.next();
    String t = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.next();
    
    // 解く
    if(s.equals(u)) a -= 1;
    else b -= 1;
    
    // 出力
    System.out.println(a + " " + b);
  }
}

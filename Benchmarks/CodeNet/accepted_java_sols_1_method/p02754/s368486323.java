import java.io.*;
import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
 
    try {
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      Long sum      = Long.parseLong(scan.next());
      Long blue     = Long.parseLong(scan.next());
      Long red      = Long.parseLong(scan.next());
      Long result   = sum/(blue+red)*blue;
      
      // 「合計と青+赤の余り」と「青いボールの数」を比較し、小さい数を加算
      result += Math.min(sum%(blue+red), blue);

      System.out.println(result);
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}
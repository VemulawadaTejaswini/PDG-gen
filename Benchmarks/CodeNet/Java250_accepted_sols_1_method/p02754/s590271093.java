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
      Long result;
      
      //算出
      if(sum%(blue+red)<=blue) {
        result = sum/(blue+red)*blue+sum%(blue+red);
      } else {
        result = sum/(blue+red)*blue+blue;
      }
      
      System.out.println(result);
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}

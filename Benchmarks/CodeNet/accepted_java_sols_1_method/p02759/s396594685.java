import java.io.*;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //標準入力受け取り
      Scanner scan = new Scanner(System.in);
      int page = Integer.parseInt(scan.next());
      
      //用紙算出
      int paper = page/2;
      
      if (page % 2 != 0) {
        paper = page/2 + 1;
      } 
      
      System.out.println(paper);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}

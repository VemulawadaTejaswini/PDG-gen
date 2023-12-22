import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //local変数
      String jadge = "Yes";
      int    atack = 0;
      
      //標準入力受け取り
      Scanner scan            = new Scanner(System.in);
      ArrayList<Integer> strs = new ArrayList<Integer>();
      
      while (scan.hasNext()){
      	strs.add(scan.nextInt());
      }
      
      for (int i=2; i<strs.size(); i++) {
      	atack += strs.get(i);
      }
      
      if (strs.get(0) > atack) {
      	jadge = "No";
      }

      System.out.println(jadge);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}

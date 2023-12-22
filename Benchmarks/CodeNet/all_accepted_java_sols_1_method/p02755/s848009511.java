import java.io.*;
import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
 
    try {
      Scanner scan   = new Scanner(System.in);      
      Long    tax1   = Long.parseLong(scan.next());
      Long    tax2   = Long.parseLong(scan.next());
      double  price1 = tax1/0.08;
      double  price2 = tax2/0.1;
      double  result = -1.0;
      
      if (price1 >= price2 && Math.ceil(price1) < (tax2+1)/0.1) {
        result = Math.ceil(price1);
      }
      
      if (price2 >= price1 && Math.ceil(price2) < (tax1+1)/0.08) {
        result = Math.ceil(price2);
      }
      
      System.out.println((int)result);
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}

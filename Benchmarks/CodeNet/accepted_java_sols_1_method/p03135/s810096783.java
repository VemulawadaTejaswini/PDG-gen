import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      double t, x;

      t=Double.parseDouble(sc.next());
      x=Double.parseDouble(sc.next());
      
      System.out.println(t/x);
                
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}

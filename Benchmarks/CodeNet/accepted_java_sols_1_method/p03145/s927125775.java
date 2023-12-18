import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int c, a, b;

      c=Integer.parseInt(sc.next());
      a=Integer.parseInt(sc.next());
      b=Integer.parseInt(sc.next());
      System.out.println(c*a/2);
                
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}

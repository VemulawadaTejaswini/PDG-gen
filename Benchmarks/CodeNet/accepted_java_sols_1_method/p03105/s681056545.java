import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      a=Integer.parseInt(sc.next());
      b=Integer.parseInt(sc.next());
      c=Integer.parseInt(sc.next());

      System.out.println(Math.min(b/a, c));
    
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}

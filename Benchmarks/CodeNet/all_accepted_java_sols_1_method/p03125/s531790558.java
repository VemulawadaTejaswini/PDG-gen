import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int a, b;

      a = Integer.parseInt(sc.next());
      b = Integer.parseInt(sc.next());

      if(b%a == 0){
        System.out.println(a + b);
      }else{
        System.out.println(b - a);
      }
    }
    catch (Exception e) {
    }
  }
}

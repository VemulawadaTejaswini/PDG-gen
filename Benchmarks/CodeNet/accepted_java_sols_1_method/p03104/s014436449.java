import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long res = 0;
      if(a % 2 == 0) {
        if(b % 2 == 0)
            res = (b - a) / 2 % 2 ^ b;
        else
            res = (b - a + 1) / 2 % 2;
      } else {
         if(b % 2 == 0)
            res = (b - a) / 2 % 2 ^ a ^ b;
         else
            res = (b - a) / 2 % 2 ^ a;
      }
      System.out.println(res);
  }
}
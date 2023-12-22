import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long res = 0;
      if(a % 2 == 1) {
        res ^= a;
        a++;
      }
      if(b % 2 == 0) {
        res ^= b;
        b--;
      }
      
      long cnt = (b - a + 1) / 2;
      if(cnt % 2 == 1)
        res ^= 1; 
      System.out.println(res);
  }
}
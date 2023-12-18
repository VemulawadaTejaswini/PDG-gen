import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      StringBuilder sb = new StringBuilder();

      while(n > 0) {
        long res = n % 26;
        if(res == 0) {
          sb.append('z');
        } else 
          sb.append((char)(res - 1 + 'a'));
        n /= 26;
      }
      System.out.println(sb.reverse().toString());
  }
}
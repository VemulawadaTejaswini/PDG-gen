import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      StringBuilder sb = new StringBuilder();
      boolean flag = false;
      if(n == 1) 
          flag = true;
      while(--n >= 1) {
        long res = n % 26;
        sb.append((char)((res) % 26 + 'a'));
        n /= 26 ;
        if(n == 1) 
          flag = true;
      }
      if(flag)
      sb.append('a');
      System.out.println(sb.reverse().toString());
  }
}
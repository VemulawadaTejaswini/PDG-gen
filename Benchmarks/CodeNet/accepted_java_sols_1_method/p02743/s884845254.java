import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      
      long num = (c - a - b);
      long cur = 0;
      long cnt = 4;
      for(long i = 1; i <= num; i++) {
          cur += num;
          if(cur >= a * b && cnt > 0) {
            cur -= a*b;
            cnt--;
          }
      }
      if(cur > 0 && cnt == 0)
        System.out.println("Yes");
      else
        System.out.println("No");
  }
}

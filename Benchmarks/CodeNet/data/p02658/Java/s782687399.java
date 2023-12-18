import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    long r = 1;
    
    for (int i = 0; i < t; i++) {
      long l = s.nextLong();
      if (l == 0) {
        System.out.println(0);
        return;
      }
      if (r == -1)
        continue;
      else if (1_000_000_000_000_000_000L < (r *= l))
        r = -1;
    }
    
    System.out.println(r);
    
  }
  
}
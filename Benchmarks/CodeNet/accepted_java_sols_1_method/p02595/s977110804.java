import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); long d = in.nextLong();
      int count = 0;
      while(n > 0){
          n--;
          long x = in.nextLong();
          long y = in.nextLong();
          if(x*x + y*y <= d*d) count++;
      }
      System.out.println(count);
    }
}
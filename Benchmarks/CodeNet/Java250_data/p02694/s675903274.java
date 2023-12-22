import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();

      long start = 100;
      long yrs = 0;
      while(start < x) {
        long unitInc = start / 100;
        start = start + unitInc;
        yrs++;

      }
      System.out.println(yrs);
  }
}
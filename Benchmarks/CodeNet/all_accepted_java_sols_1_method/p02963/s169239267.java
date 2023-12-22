import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long mod = s % ((long)Math.pow(10, 9));
    long x3 = (long)Math.pow(10, 9) - mod;
    if(mod == 0) x3 = 0;
    long y3 = (s + x3) / (long)(Math.pow(10, 9));
    long x1 = 0;
    long y1 = 0;
    long x2 = (long)Math.pow(10, 9);
    long y2 = 1;
    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
  }
}
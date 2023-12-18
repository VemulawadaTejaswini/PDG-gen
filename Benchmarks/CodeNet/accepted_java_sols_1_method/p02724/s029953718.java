import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long t = x / 500;
    x -= (500 * t);
    long s = x / 5;
    System.out.println((1000 * t) + (5 * s));
  }
}
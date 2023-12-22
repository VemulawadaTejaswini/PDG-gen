import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long x = in.nextLong();
    long t = in.nextLong();
    long temp = (long) Math.ceil((double) n/x);
    System.out.println(temp*t);
    in.close();
  }
}

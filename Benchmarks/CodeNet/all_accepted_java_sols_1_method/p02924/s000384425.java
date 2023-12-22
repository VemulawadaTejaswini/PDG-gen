import java.util.*;

public class Main{
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    long ans = N*(N-1)/2;
    System.out.println(ans);
  }
}
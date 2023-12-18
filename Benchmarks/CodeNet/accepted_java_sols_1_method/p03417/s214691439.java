import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long ans = Math.abs(N - 2) * Math.abs(M - 2);
    System.out.println(ans);
  }
}
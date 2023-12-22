import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long ans = a * c > a * d ? a * c : a * d;
    ans = b * c > ans ? b * c : ans;
    ans = b * d > ans ? b * d : ans;
    
    System.out.println(ans);
  }
}
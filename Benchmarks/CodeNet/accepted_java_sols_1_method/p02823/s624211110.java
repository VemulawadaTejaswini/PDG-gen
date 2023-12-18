import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = (b - a) / 2;
    if(((b - a) % 2) == 1) ans = Math.min((a + (b - a - 1) / 2), (n - b + 1 + (b - a - 1) / 2)); 
    System.out.println(ans);
  }
}


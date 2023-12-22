import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int i = 1;
    int ans = 0;
    while (n != 0) {
      ans += i*(n % 10 == 1 ? 9 : 1);
      n /= 10;
      i *= 10;
    }
    
    System.out.println(ans);
  }
}
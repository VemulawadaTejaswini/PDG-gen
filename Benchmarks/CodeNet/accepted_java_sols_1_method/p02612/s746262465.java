import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = (n % 1000);
    int ans = 0;
    if(r > 0) ans = 1000 - r;
    System.out.println(ans);
  }
}
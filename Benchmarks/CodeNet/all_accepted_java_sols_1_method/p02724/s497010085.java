import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    sc.close();

    long ans = 0;
    ans += (X / 500) * 1000;
    int x = X % 500;
    ans += (x / 5) * 5;
    System.out.println(ans);
  }
}
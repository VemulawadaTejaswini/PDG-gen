import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  cat = sc.nextInt();
    int catOrDog = sc.nextInt();
    int ans = sc.nextInt();
    if (ans >= cat && ans <= cat + catOrDog) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
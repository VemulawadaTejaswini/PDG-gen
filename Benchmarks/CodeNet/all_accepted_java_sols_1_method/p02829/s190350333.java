import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int ans = 1;
    for (; ans <= 3; ans++)
      if (ans != A && ans != B) break;
    System.out.println(ans);
  }
}
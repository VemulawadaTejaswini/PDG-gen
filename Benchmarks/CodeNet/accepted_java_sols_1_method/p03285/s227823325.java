import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "No";
	for (int i = 0; i <= 15; i++) {
      for (int j = 0; j <= 25; j++) {
        if (N == (7 * i + 4 * j)) {
          ans = "Yes";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}

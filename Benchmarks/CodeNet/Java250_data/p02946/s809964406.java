
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();// X +- (K -1)

    StringBuilder sb = new StringBuilder();
    for (int i = X - (K - 1); i <= X + (K - 1); i++ ) {
      sb.append(i).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}

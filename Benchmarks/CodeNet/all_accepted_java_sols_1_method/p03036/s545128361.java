
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x = sc.nextInt();

    for (int i = 0; i < 10; i++) {
      // xi+1=r*xi−D
      System.out.println(r * x - D);
      x = r * x - D;
    }

  }
}

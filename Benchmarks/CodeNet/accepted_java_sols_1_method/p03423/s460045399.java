import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    for (int i = 0;; i++) {
      if (n < 3) break;
      n -= 3;
      count++;
    }
    System.out.println(count);
  }

}

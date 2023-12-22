import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean hasYellow = false;
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      if (sc.next().equals("Y")) {
        hasYellow = true;
        break;
      }
    }
    System.out.println(hasYellow ? "Four" : "Three");
  }
}

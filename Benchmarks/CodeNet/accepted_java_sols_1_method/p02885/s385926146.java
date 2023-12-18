import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int window = Integer.parseInt(sc.next());
    int curtain = Integer.parseInt(sc.next());
    if(window - 2 * curtain > 0) {
      System.out.println(window - 2 * curtain);
    } else {
      System.out.println(0);
    }
  }
}

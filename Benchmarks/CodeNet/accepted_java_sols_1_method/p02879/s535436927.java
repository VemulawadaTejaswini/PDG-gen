import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if(a < 10 && b < 10) {
      System.out.println(a * b);
    } else {
      System.out.println(-1);
    }
  }
}

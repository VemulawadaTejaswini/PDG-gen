import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    sc.close();
    if (A + B + C >= 22) {
      System.out.println("bust");
    } else {
      System.out.println("win");
    }
  }
}

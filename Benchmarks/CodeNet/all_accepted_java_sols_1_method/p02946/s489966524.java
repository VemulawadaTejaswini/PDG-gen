import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    for (int i = B - A + 1; i <= B + A - 1; i++) {
      System.out.println(i);
    }
  }
}

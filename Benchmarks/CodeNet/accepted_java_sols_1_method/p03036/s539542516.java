import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int x2000 = sc.nextInt();

    int prevVal = x2000;
    for (int i = 1; i <= 10; i++) {
      int val = r*prevVal - D;
      prevVal = val;
      System.out.println(val);
    }
  }
}


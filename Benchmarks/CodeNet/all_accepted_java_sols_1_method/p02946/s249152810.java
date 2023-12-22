import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y1 = 1000000;
    int y2 = (-1) * y1;
    int x1 = Math.max(x - k + 1, y2);
    int x2 = Math.min(x + k - 1, y1);
    for(int i = x1; i <= x2; i++) {
      System.out.print(i + " ");
    }
  }
}
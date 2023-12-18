import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[10];
    for (int i = 0; i < 4; i++) {
      int tmp = sc.nextInt();
      n[tmp]++;
    }
    if (n[1] == 1 && n[9] == 1 && n[7] == 1 && n[4] == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
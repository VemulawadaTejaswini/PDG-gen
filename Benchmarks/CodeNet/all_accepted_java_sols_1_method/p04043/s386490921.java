import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[11];
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    n[a]++;
    n[b]++;
    n[c]++;
    if (n[5] == 2 && n[7] == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
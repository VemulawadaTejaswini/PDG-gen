import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] abc = new int[10];
    for (int i = 0; i < 3; i++) {
      int tmp = sc.nextInt();
      abc[tmp]++;
    }
    if (abc[5] == 2 && abc[7] == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
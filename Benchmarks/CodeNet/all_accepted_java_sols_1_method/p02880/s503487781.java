import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] map = new int[101];
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        map[i*j] = 1;
      }
    }

    Scanner sc = new Scanner(System.in);
    if (map[sc.nextInt()] == 1) System.out.println("Yes");
    else System.out.println("No");
    sc.close();
    return;
  }
}

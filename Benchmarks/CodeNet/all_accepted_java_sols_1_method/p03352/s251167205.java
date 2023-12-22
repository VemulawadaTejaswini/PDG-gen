import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    ArrayList<Integer> expo = new ArrayList<>();
    for (int b = 1; b <= 1000; b++) {
      int tmp = b;
      for (int p = 2; p <= 9; p++) {
        tmp *= b;
        if (tmp <= x) {
          expo.add(tmp);
        }
      }
    }
    Collections.sort(expo);
    System.out.println(expo.get(expo.size() - 1));
  }
}
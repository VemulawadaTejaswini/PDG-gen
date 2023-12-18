import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int alice = 0;
    int bob = 0;
    int N = Integer.parseInt(sc.nextLine());
    String[] sCards = sc.nextLine().split(" ");
    List<Integer> iCards = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        iCards.add(Integer.parseInt(sCards[i]));
    }
    for (int n = 0; n < N; n++) {
      int max = 0;
      for (int c: iCards) {
        max = Math.max(max, c);
      }
      if (n == 0 || n % 2 == 0) {
        alice += max;
      } else {
        bob += max;
      }
      iCards.remove(iCards.indexOf(max));
    }
    System.out.println(alice - bob);
  }
}

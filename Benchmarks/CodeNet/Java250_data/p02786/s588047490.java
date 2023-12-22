import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final long initialHitPoint = scanner.nextLong();

    System.out.println(getAttackCount(initialHitPoint));
  }

  private static long getAttackCount(long hitPoint) {
    if (hitPoint == 1) {
      return 1;
    }

    return getAttackCount(hitPoint / 2) * 2 + 1;
  }
}
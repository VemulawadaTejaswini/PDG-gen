import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int t = X / 100;
    int p = X % 100;
    p = p / 5 + (p % 5 != 0 ? 1 : 0);
    if (p <= t) System.out.println(1);
    else System.out.println(0);
  }
}

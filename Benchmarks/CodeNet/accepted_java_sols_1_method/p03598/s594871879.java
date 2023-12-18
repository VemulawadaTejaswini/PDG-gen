import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();
    int[] xs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int r = 0;
    for (int x : xs) {
      if (x > k - x) {
        r += 2 * (k - x);
      } else {
        r += 2 * x;
      }
    }
    System.out.println(r);
    sc.close();
  }
}

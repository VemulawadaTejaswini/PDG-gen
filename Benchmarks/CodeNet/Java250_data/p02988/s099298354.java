import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int t1 = scan.nextInt();
    int t2 = scan.nextInt();
    int t3;
    int count = 0;
    for (int i = 2; i < n; i++) {
      t3 = scan.nextInt();
      if (judge(t1, t2, t3)) {
        count++;
      }
      t1 = t2;
      t2 = t3;
    }
    System.out.println(count);
  }

  private static boolean judge(int t1, int t2, int t3) {
    return (t1 < t2 && t2 < t3) || (t3 < t2 && t2 < t1);
  }
}

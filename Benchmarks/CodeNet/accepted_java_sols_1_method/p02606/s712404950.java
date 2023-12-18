import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    int a;
    int count = 0;
    for (int i = 0; i < r + 1; i++) {
      a = d * i;
      if (a >= l && a <= r) {
        count = count + 1;
      }
    }
    System.out.println(count);
  }
}
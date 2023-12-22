import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    while (true) {
      boolean flag = false;
      for (int i = 0; i < n; i++) {
        if (a[i] % 2 != 0) {
          flag = true;
          break;
        }
      }
      if (flag) break;
      for (int i = 0; i < n; i++) {
        a[i] = a[i] / 2;
      }
      count++;
    }
    System.out.println(count);
  }
}
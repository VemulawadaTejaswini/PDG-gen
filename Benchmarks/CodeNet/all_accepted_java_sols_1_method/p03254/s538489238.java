import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int count = 0;
    boolean flag = true;
    for (int i = 0; i < n; i++) {
      if (x - a[i] >= 0) {
        x -= a[i];
        count++;
      } else {
        flag = false;
        break;
      }
    }
    if (x > 0 && flag) count--;
    System.out.println(count);
  }
}
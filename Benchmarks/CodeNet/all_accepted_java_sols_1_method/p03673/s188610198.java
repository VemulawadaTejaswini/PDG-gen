import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }
    ArrayList<Integer> b = new ArrayList<>();
    if (n % 2 == 0) {
      for (int i = n; i >= 2; i -= 2) {
        b.add(a[i]);
      }
      for (int i = 1; i < n; i += 2) {
        b.add(a[i]);
      }
    } else {
      for (int i = n; i >= 1; i -= 2) {
        b.add(a[i]);
      }
      for (int i = 2; i < n; i += 2) {
        b.add(a[i]);
      }
    }
    for (int i = 0; i < b.size(); i++) {
      if (i == 0) {
        System.out.print(b.get(i));
      } else {
        System.out.print(" " + b.get(i));
      }
    }
    System.out.println();
  }
}
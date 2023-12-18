import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    if (n <= 0) {
      System.out.println(0 + " " + 0 + " " + 0);
    } else {
      System.out.println(min(a) + " " + max(a) + " " + sum(a));
    }
  }
  static int min(int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
      }
    }
    return min;
  }
  static int max(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    return max;
  }
  static int sum(int[] a) {
    int sum = a[0];
    for (int i = 1; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}

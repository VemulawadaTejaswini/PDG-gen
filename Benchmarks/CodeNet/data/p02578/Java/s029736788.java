import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      if(a[i] > a[i + 1]) {
        int dai = a[i] - a[i + 1];
        sum = sum + dai;
        a[i + 1] = a[i];
    }
    System.out.println(sum);
  }
}
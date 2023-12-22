import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];
    int maxv = -2000000000;
    int minv = stdIn.nextInt();
    for (int i = 1; i < n; i++) {
      a[i] = stdIn.nextInt();
      maxv = Math.max(maxv, a[i] - minv);
      minv = Math.min(minv, a[i]);
    }
    System.out.println(maxv);
  }
}
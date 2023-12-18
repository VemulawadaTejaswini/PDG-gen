import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    long max = h[0];
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    for (int i = 0; i < n -1; i++) {
      max = Math.max(max, h[i]);
      long x = max - h[i + 1];
      if (x > 1) {
        System.out.println("No");
        System.exit(0);  
      }
    }
    System.out.println("Yes");
  }
}
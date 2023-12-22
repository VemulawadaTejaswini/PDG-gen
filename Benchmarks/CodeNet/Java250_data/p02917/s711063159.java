import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n];
    for (int i = 1; i < n; i++) {
      int num = sc.nextInt();
      b[i] = num;
    }
    long total = b[1];
    for(int i = 2; i < n; i++) {
      int min = Math.min(b[i], b[i-1]);
      total += min;
    }
    System.out.println(total + b[n-1]);
  }
}

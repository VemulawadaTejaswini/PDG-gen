import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] points = new int[n];
    for (int i = 0; i < n; i++) {
      points[i] = sc.nextInt();
    }
    int left = 0;
    int right = k;
    for (int i = 0; i < n - k; i++) {
      if (points[left] < points[right]) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      left++;
      right++;
    }
  }
}

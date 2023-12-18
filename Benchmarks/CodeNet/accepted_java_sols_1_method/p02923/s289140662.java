import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    int max = 0;
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      h[i] = num;
    }
    int curr = h[0];
    int index = 1;
    int count = 0;
    while(index < n) {
      while(index < n && curr >= h[index]) {
        count++;
        curr = h[index];
        index++;
      }
      max = Math.max(count, max);
      if (index < n) curr = h[index];
      index++;
      count = 0;
    }
    System.out.println(max);
  }
}

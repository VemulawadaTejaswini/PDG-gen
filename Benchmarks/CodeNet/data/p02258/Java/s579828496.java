import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int min = arr[0];
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
      max = Math.max(max, arr[i] - min);
      min = Math.min(min, arr[i]);
    }
    System.out.println(max);
  }
}


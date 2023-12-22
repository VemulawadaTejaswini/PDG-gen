import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextInt();
    }

    int result = 100;
    for (int i = 0; i < n; i++) {
      int t = i;

      int left = 0;
      int right = 0;
      for (int j = 0; j < n; j++) {
        if(t >= j) {
          left += list[j];
        } else if (t < j) {
          right += list[j];
        }
      }

      int abs = Math.abs(left - right);

      if(abs < result) {
        result = abs;
      }
    }

    System.out.println(result);
  }
}

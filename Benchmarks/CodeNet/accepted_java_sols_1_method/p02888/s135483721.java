import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int res = 0;
    for (int i = l.length - 1; i >= 2; i--) {
      for (int j = i - 1; j >= 1; j--) {
        for (int k = j - 1; k >= 0; k--) {
          if (l[i] < l[j] + l[k]) {
            res++;
          }
        }
      }
    }
    System.out.println(res);
  }
}

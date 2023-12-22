import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] in  = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = in[0];
    int m = in[1];
    int c = in[2];
    int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int r = 0;
    for (int i = 0; i < n; i++) {
      int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int sum = 0;
      for (int j = 0; j < m; j++) {
        sum += a[j] * b[j];
      }
      if (sum + c > 0) {
        ++r;
      }
    }
    System.out.println(r);
    sc.close();
  }
}

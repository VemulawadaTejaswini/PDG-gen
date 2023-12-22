import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    int[] xyz = new int[n];
    for (int i = 0; i < n; i++) {
      xyz[i] = input.nextInt();
    }
    Arrays.sort(xyz);
    long ans = 0;
    for (int i = n - k - 1; i >= 0; i--) {
      ans += xyz[i];
    }
    System.out.print(ans);
  }

}

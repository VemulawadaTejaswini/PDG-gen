import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int alice = 0;
    for (int i = n - 1; i >= 0; i -= 2) {
      alice += arr[i];
    }
    int bob = 0;
    for (int i = n - 2; i >= 0; i -= 2) {
      bob += arr[i];
    }
    System.out.println(alice - bob);
  }
}


import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[m];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    long sum = Arrays.stream(arr).sum();
    if (n - sum < 0) {
      System.out.println("-1");
    } else {
      System.out.println(n - sum);
    }
  }
}


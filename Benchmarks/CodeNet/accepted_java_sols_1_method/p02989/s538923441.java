import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] d = new int[n];

    for (int i = 0; i < n; ++i)
      d[i] = sc.nextInt();

    Arrays.sort(d);

    int mid = n / 2;

    System.out.println(d[mid] - d[mid - 1]);

  }
}
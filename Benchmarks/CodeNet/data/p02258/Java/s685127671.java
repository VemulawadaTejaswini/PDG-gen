import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long[] R = new long[n];
    for (int i = 0; i < n; i++) {
        R[i] = sc.nextLong();
    }

    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        max = Math.max(R[i] - min, max);
        min = Math.min(R[i], min);
    }

    System.out.println(max);
  }
}

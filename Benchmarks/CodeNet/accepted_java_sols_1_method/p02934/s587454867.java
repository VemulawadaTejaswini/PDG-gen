import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    double gyaku = 0;
      for (int i = 0; i < n; i++) {
      gyaku += 1d / (double)a[i];
    }

    System.out.println(1d / gyaku);
  }
}
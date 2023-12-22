import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
    }
    int min = m[0];
    int sum = m[0];
    for (int i = 1; i < n; i++) {
      if (min > m[i]) {
        min = m[i];
      }
      sum += m[i];
    }
    System.out.println(n + (x - sum) / min);
  }

}

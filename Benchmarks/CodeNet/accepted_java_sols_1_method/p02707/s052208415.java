
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] pos = new int[n + 1];
    for (int i = 0; i < n - 1; i++) {
      pos[sc.nextInt()]++;
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(pos[i]);
    }
  }
}


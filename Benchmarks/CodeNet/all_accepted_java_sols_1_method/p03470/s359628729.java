import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[101];
    for (int i = 0; i < N; i++) {
      int number = sc.nextInt();
      d[number]++;
    }
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (d[i] > 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
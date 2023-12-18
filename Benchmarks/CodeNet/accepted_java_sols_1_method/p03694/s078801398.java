import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      int number = sc.nextInt();
      min = Math.min(min, number);
      max = Math.max(max, number);
    }
    System.out.println(max - min);
  }
}

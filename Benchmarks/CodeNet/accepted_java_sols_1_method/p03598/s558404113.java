import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int total =0;
    for (int i =0; i<N; i++) {
      int x = sc.nextInt();
      total += Math.min(x, Math.abs(x-K));
    }
    System.out.print(total * 2);
  }
}
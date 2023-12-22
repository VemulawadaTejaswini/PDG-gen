import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    output(D, N);
  }
  public static void output(int D, int N) {
    if (N != 100) {
      System.out.println((int) (N * Math.pow(100, D)));
    } else {
      System.out.println((int) ((N + 1) * Math.pow(100, D)));
    }
  }
}

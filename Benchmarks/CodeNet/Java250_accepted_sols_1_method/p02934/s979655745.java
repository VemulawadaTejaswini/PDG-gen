import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[] A = new double[N];
    double total =0;
    for (int i=0; i<N; i++) {
      A[i] = 1 / sc.nextDouble();
      total += A[i];
    }
    System.out.print(1 / total);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, A, B;
    N = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();

    if(A*N < B) {
      System.out.println(A*N);
    } else {
      System.out.println(B);
    }
  }
}
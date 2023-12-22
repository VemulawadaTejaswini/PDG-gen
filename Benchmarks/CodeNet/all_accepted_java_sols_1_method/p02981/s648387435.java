import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, A, B;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = sc.nextInt();
      B = sc.nextInt();
    }
    int answer = (int)Math.min(A*N, B);
    System.out.println(answer);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int A, B;
    try(Scanner sc = new Scanner(System.in)) {
      A = sc.nextInt();
      B = sc.nextInt();
    }
    int sum = A + B;
    int diff = A - B;
    int prod = A * B;
    int cand = Math.max(sum, diff);
    cand = Math.max(cand, prod);
    System.out.println(cand);
  }
}
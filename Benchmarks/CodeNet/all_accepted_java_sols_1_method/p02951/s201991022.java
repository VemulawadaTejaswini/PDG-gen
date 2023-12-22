import java.util.*;

public class Main {
  public static void main(String[] args) {
    int A, B, C;
    try(Scanner sc = new Scanner(System.in)) {
      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();
    }
    int answer = C - (int)(Math.min(C, A-B));
    System.out.println(answer);
  }
}
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A = 1;
    for (int i = 1; i <= N; i++) {
      A = A * i;
      A = (long) (A % (Math.pow(10, 9) + 7));
    }
    System.out.println(A);
  }
}

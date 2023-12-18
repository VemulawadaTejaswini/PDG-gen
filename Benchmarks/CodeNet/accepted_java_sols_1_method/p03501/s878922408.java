import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    int result = B;
    if ((N * A) <= B)
      result = A * N;

    System.out.println(result);

  }
}

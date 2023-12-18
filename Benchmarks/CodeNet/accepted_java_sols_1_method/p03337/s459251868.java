import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int a = A + B;
      int b = A - B;
      int c = A * B;
      int result = Math.max(a, Math.max(b, c));

      System.out.println(result);
    }
  }
}

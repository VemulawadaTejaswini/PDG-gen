import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
       String result = A <= 8 && B <= 8 ? "Yay!" : ":(";

      System.out.println(result);
    }
  }
}

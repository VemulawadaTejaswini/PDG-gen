import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int N3 = N / 100;
    int N1 = N % 10;
    if (N1 == N3) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
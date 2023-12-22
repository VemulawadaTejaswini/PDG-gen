import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    boolean ans = false;
    for (int i = A; !ans && i <= B; i++)
      ans = i % K == 0;

    System.out.println(ans ? "OK" : "NG");
  }
}
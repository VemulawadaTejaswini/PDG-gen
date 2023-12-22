import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int OK =0;
    for (int i =A; i<=B; i++) {
      if (i % K == 0) {
        OK++;
        break;
      }
    }
    if (OK == 1) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}
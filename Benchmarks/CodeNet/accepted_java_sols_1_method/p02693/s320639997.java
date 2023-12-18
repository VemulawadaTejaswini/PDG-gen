import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    for (int i = 1; i <= 1000; i++) {
      if (K * i >= A && K * i <= B) {
        System.out.println("OK");
        return;
      }
    }
    System.out.println("NG");

  }
}

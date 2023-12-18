import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    boolean approved = true;
    for (int i = 0; i < N; i++) {
      int n = sc.nextInt();
      if (n % 2 == 1) {
        continue;
      }

      if (n % 3 == 0 || n % 5 == 0) {
        continue;
      }

      approved = false;
    }
    if (approved) {
      System.out.println("APPROVED");
    } else {
      System.out.println("DENIED");
    }
    sc.close();
  }
}
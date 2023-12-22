import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String answer = "No";
    for (int i = 0; i <= n; i++) {
      if (answer == "Yes") break;
      for (int j = 0; j <= n; j++) {
        int sum = i * 4 + j * 7;
        if (sum == n) {
          answer = "Yes";
          break;
        }
      }
    }
    System.out.println(answer);
  }
}
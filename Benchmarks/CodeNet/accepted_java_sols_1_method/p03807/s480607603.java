import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int oddCount = 0;
    for (int i = 0; i < n; i++) {
      if (sc.nextInt() % 2 == 1) {
        oddCount++;
      }
    }
    System.out.println(oddCount % 2 == 0 ? "YES" : "NO");
  }
}
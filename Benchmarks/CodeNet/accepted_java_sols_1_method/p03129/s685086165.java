import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    String ans = (n + 1) / 2 >= k ? "YES" : "NO";
    System.out.println(ans);
  }

}

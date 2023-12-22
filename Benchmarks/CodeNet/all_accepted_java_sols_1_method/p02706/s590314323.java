import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int total = 0;
    for (int i = 0; i < m; i++ ) {
      total += sc.nextInt();
    }

    int rest = n - total;
    System.out.println(rest >= 0 ? rest : -1);
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int count = 0;
    for (int i = 1; i <= N; i++) {
      int tmp = scan.nextInt();
      if (tmp != i) {
        count++;
      }
    }


    if (count <= 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}

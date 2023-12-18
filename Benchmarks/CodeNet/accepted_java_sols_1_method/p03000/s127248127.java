import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l[] = new int[n];
    for (int cnt = 0; cnt < n; cnt++) {
      l[cnt] = sc.nextInt();
    }
    int d = 0;
    int i = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      d += l[cnt];
      if (d > x) {
        i = cnt + 1;
        break;
      } else {
        i = n + 1;
      }
    }
    System.out.println(i);
    sc.close();
  }
}
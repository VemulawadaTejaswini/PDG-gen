import java.util.Scanner;

class Main {
  public static void main(String argv[]) {
    int n, k, sum = 0;
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    k = Integer.parseInt(sc.next());
    for (int i = 0;i < n;i++) {
      if (Integer.parseInt(sc.next()) >= k)
        sum++;
    }
    System.out.println(sum);
  }
}
import java.util.Scanner;

class Main {
  public static void main(String argv[]) {
    int n, x, a = 1000, m;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    x = sc.nextInt();
    
    for (int i = 0;i < n;i++) {
      m = sc.nextInt();
      x -= m;
      a = Math.min(a, m);
    }
    
    System.out.println(n + x/a);
  }
}
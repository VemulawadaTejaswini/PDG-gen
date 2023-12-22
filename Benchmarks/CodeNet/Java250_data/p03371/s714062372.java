import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    int a, b, c, x, y, sum = 0;
    Scanner sc = new Scanner(System.in);
    a = Integer.parseInt(sc.next());
    b = Integer.parseInt(sc.next());
    c = Integer.parseInt(sc.next());
    x = Integer.parseInt(sc.next());
    y = Integer.parseInt(sc.next());
    int min = Math.min(x, y);
    
    if (a + b >= c * 2) {
      sum += c * 2 * min;
      x -= min;
      y -= min;
    }
    
    sum += Math.min(a, c * 2) * x + Math.min(b, c * 2) * y;
    
    System.out.println(sum);
  }
}
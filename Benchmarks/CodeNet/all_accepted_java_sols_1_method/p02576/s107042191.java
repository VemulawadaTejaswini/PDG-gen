import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    String x = scan.next();
    String t = scan.next();
    int nn = Integer.parseInt(n);
    int xx = Integer.parseInt(x);
    int tt = Integer.parseInt(t);
    
    int times;
    if (nn % xx == 0) {
      times = nn / xx;
    } else {
      times = (nn / xx) + 1;
    }
    int answer = tt * times;
    
    System.out.println(answer);
  }
}
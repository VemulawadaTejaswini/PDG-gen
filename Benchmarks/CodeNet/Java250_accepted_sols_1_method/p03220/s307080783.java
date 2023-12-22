import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();

    double min = 1000.0f;
    int ans = -1;

    for (int i = 0; i < n; ++i) {
      int h = sc.nextInt();
      double tmp = Math.abs(a - (t - h * 0.006));
      if (tmp < min) {
        min = tmp;
        ans = i + 1;
      }
    }

    System.out.println(ans);
    
    sc.close(); 
  }
}

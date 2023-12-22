import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 0;

    for (int n = 1; n <= N; n++) {
      int a = n % 3;
      int b = n % 5;
      if (a != 0 && b != 0) {
        ans = ans + n;
      }
    }
    
    System.out.println(ans);
  }
}
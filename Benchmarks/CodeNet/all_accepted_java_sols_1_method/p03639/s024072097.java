import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < N; i++) {
      int n = sc.nextInt();
      if(n % 4 == 0) {
        a++;
      } else if(n % 2 == 0) {
        b++;
      } else {
        c++;
      }
    }
    String ans = "No";
    if(c == 0) {
      ans = "Yes";
    } else if(c == 1) {
      if(a > 0) ans = "Yes";
    } else {
      if(a >= c) ans = "Yes";
      if(a == c - 1 && b == 0) ans = "Yes";
    }
    System.out.println(ans);
  }
}
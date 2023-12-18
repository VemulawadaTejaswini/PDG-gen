import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = n;
    int s = 0;
    for(int i = 0; i < 10; i++) {
      int t = m % 10;
      s += t;
      m /= 10;
      if(m == 0) break;
    }
    String ans = "No";
    if((n % s) == 0)  ans = "Yes";
    System.out.println(ans);
  }
}
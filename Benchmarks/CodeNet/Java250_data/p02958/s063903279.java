import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = 0;
    for(int i = 1; i <= n; i++) {
      if((sc.nextInt()) != i) t++;
    }
    String ans = "NO";
    if((t == 0) || (t == 2)) ans = "YES";
    System.out.println(ans);
  }
}

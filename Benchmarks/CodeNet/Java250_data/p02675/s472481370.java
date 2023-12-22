import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  String[] book = new String[] {"pon", "pon", "hon", "bon", "hon", "hon", "pon", "hon", "pon", "hon"};
  String ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    ans = book[n % 10];
  }

  void show() {
    System.out.println(ans);
  }
}

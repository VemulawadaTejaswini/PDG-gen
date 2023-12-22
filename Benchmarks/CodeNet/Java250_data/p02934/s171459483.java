import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    List<Integer> a = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      a.add(scan.nextInt());
    }

    double ans = 0.0;
    for(int i : a) ans += 1.0 / i;
    ans = 1.0 / ans;

    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    int sum = 0;
    int res;
    for (int i = 0; i < n; i++) {
      int hoge = sc.nextInt();
      sum += hoge;
      list.add(hoge);
    }
    res = list.size();
    for (int i: list) {
      if (i < (sum+4*m-1) / (4*m)) res--;
    }
    if (res >= m) System.out.println("Yes");
    else System.out.println("No");
    sc.close();
  }
}
import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int A = 0;
    int cnt = N;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
      X -= list.get(i);
    }
    Collections.sort(list);
    int min = list.get(0);
    while (X >= min) {
      X = X - min;
      cnt++;
    }
    System.out.println(cnt);
  }
}

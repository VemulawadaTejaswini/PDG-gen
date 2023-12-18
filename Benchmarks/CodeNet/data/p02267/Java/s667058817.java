import java.util.Scanner;
import java.util.HashSet;
public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    HashSet<Integer> S = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
      S.add(s.nextInt());
    }
    int q = s.nextInt();
    int[] T = new int[q];
    for (int i = 0; i < q; i++) {
      T[i] = s.nextInt();
    }
    int count = 0;
    for (int t : T) {
      if (S.contains(t))
        count++;
    }
    System.out.println(count);
  }
}


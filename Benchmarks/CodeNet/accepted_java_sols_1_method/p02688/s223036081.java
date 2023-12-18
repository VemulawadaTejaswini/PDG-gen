import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //すぬけくんの数
    int k = sc.nextInt(); //お菓子の種類

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        set.add(sc.nextInt());
      }
    }

    System.out.println(n - set.size());

  }
}

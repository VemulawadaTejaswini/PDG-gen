import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<String> keihin = new HashSet<String>();

    for (int i = 0; i < n; i++) {
      keihin.add(sc.next());
    }

    System.out.println(keihin.size());
  }
}

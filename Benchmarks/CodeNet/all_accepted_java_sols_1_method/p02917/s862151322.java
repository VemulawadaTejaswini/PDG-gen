import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<Integer> as = new ArrayList<>();
    ArrayList<Integer> bs = new ArrayList<>();

    for (int i = 0; i < n-1; i++) {
      bs.add(sc.nextInt());
    }

    int ans = bs.get(0) + bs.get(n-2);

    for (int i = 0; i < n-2; i++) {
      ans += Math.min(bs.get(i), bs.get(i+1));
    }

    System.out.println(ans);
  }
}

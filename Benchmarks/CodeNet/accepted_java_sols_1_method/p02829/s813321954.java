import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    List<Integer> answers = Arrays.asList(a, b);
    List<Integer> target = Arrays.asList(1, 2, 3);
    int ans = target.stream()
            .filter(n -> !answers.contains(n))
            .collect(Collectors.toList())
            .get(0);
    System.out.println(ans);
  }
}
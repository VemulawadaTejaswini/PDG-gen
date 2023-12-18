import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += collect.get(i);
    }
    System.out.println(sum);
  }
}

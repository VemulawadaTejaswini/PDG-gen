import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.nextLine();
    final int A = scan.nextInt();
    final int B = scan.nextInt();
    scan.nextLine();
    String[] splited = scan.nextLine().split(" ");
    List<Integer> list = Arrays.stream(splited).map(Integer::parseInt).collect(Collectors.toList());
    long list1 = list.stream().filter(l -> 1 <= l && l <= A).count();
    long list2 = list.stream().filter(l -> A < l && l <= B).count();
    long list3 = list.stream().filter(l -> B < l && l <= 20).count();

    long result = Math.min(Math.min(list1, list2), list3);
    System.out.println(result);
  }
}

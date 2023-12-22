import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] sNumbers = sc.nextLine().split(" ");
    Map<Integer, Integer> numbers = new HashMap<>();
    for (Integer i = 0; i < sNumbers.length; i++) {
      numbers.put(Integer.parseInt(sNumbers[i]), i);
    }
    if (numbers.size() == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String line = sc.next();
    long max = Long.MIN_VALUE;
    for (int i = 1; i < n; i++) {
      Set<Character> set1 = new HashSet<>();
      Set<Character> set2 = new HashSet<>();
      for (char c : line.substring(0, i).toCharArray()) set1.add(c);
      for (char c : line.substring(i).toCharArray()) set2.add(c);
      long count = set1.stream().filter(set2::contains).count();
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, count = 0;
    number_n = Integer.parseInt(sc.next());
    int[] level = new int[number_n];
    for(i = 0; i < number_n; i++) level[i] = Integer.parseInt(sc.next());
    Arrays.sort(level);
    count = level[number_n/2] - level[number_n/2-1];
    System.out.println(count);
  }
}

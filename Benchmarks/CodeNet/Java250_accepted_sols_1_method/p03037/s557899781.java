import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cards = sc.nextInt();
    int gates = sc.nextInt();

    Integer[] start = new Integer[gates];
    Integer[] end = new Integer[gates];
    for (Integer i = 0; i < gates; i++) {
      start[i] = sc.nextInt();
      end[i] = sc.nextInt();
    }

    Arrays.sort(start, Collections.reverseOrder());
    Arrays.sort(end);

    Integer result = end[0] - start[0] + 1;

    if(result < 0) {
      result = 0;
    }

    System.out.println(result);
  }
}

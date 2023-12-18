import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int max = 0;
    ArrayList<Integer> N = new ArrayList<Integer>();
    for (int i = 0; i < A; i++) {
      N.add(sc.nextInt());
      max = Math.max(max, N.get(i));
    }
    Collections.sort(N, Collections.reverseOrder());
    N.set(0, max / 2);
    System.out.println(N.stream().mapToInt(x -> x).sum());
  }
}

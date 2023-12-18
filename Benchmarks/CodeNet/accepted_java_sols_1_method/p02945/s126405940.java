import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    List<Integer> list = Arrays.asList(A + B, A - B, A * B);
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list.get(0));
  }
}

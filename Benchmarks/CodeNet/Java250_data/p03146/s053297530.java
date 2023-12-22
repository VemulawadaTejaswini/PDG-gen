import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(N);
    while (true) {
      if (N % 2 == 0) {
        N /= 2;
      } else {
        N = N * 3 + 1;
      }
      if (list.contains(N)) {
        list.add(N);
        System.out.println(list.size());
        break;
      } else {
        list.add(N);
      }
    }
  }
}

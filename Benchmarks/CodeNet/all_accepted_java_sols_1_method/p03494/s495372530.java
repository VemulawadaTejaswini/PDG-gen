import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int count = 0;
      while (A[i] > 0) {
        if (A[i] % 2 == 0) {
          count++;
          A[i] /= 2;
        } else {
          break;
        }
      }
      list.add(count);
    }
    Collections.sort(list);
    System.out.println(list.get(0));
  }
}
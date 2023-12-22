import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      map.put(A[i], i + 1);
    }

    for (int i = 1; i <= N; i++) {
      System.out.print(map.get(i) + " ");
    }

    sc.close();
  }
}
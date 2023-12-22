import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    ArrayList<Integer> number = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      number.add(X[i]);
    }
    if (N == 2) {
      System.out.println(X[1]);
      System.out.println(X[0]);
      return;
    }
    Collections.sort(number);
    for (int i = 0; i < N; i++) {
      if (X[i] < number.get(N / 2)) {
        System.out.println(number.get(N / 2));
      } else {
        System.out.println(number.get((N / 2) - 1));
      }
    }
  }
}
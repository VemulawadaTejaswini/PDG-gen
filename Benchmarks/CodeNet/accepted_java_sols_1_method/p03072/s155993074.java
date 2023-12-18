import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    int first = H[0];
    int count = 1;
    for (int i = 1; i < N; i++) {
      if (first <= H[i]) {
        count++;
        first = H[i];
      }
    }
    System.out.println(count);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int cnt = 0;

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    while (true) {
      boolean isOdd = true;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
          arr[i] = arr[i] / 2;
        } else {
          isOdd = false;
        }
      }
      if (!isOdd) break;
      cnt++;
    }
    System.out.println(cnt);
  }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int H[] = new int[N];
    int count = 0;
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    for (int i = 0; i < N - 1; i++) {
      if (H[i] >= H[i + 1]) {
        count++;
      } else {
        list.add(count);
        count = 0;
      }

      if (i == N - 2) {
        list.add(count);
      }

    }

    int max = 0;
    for (int i = 0; i < list.size(); i++) {
      if (max <= list.get(i)) {
        max = list.get(i);
      }
    }

    System.out.println(max);

    sc.close();
  }
}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // スペース区切りの整数の入力
    int N = sc.nextInt();
    int M = sc.nextInt();

    List<Boolean> nList = new ArrayList<>();
    List<Integer> hList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      hList.add(sc.nextInt());
      nList.add(true);
    }

    for (int i = 0; i < M; i++) {
      int Ai = sc.nextInt() - 1;
      int Bi = sc.nextInt() - 1;
      int A = hList.get(Ai);
      int B = hList.get(Bi);
      if (A < B) {
        nList.set(Ai, false);
      } else if (B < A) {
        nList.set(Bi, false);
      } else {
        nList.set(Ai, false);
        nList.set(Bi, false);
      }
    }

    System.out.println(nList.stream().filter(Boolean::booleanValue).count());
  }
}
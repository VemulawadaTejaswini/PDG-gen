import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    int N = sc.nextInt();
    int K = sc.nextInt();
    for(int i = 0;i < N;i++) {
      al.add(sc.nextInt());
    }
    Collections.sort(al,Collections.reverseOrder());
    Long turn = 0L;
    for(int i = 0;i < (N - K);i++) {
      turn += al.get(K + i);
    }
    System.out.println(turn);
  }
}
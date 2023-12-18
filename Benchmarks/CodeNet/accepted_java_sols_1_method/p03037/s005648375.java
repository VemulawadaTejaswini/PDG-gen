import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int G[] = new int[N+2];
    for (int i = 0; i < M; i++) {
      G[sc.nextInt()]++;
      G[sc.nextInt()+1]--;
    }
    int count = 0;
    for (int i = 1; i < N+2; i++) {
      if (i > 0) {
        G[i] += G[i - 1];
      }
      if (G[i] == M) count++;
    }
    System.out.println(count);
  }
}

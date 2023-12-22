import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] players = new int[N];
    Arrays.fill(players, 0);
    for (int i = 0; i < Q; i++)
      players[sc.nextInt() - 1]++;
    for (int i = 0; i < N; i++)
      System.out.println(Q - players[i] < K ? "Yes" : "No");
  }
}
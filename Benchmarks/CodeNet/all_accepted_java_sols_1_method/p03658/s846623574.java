import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] l = new int[N];
    int max = 0;
    for(int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    for(int i = N - 1; i >= N - K; i--) {
      max += l[i];
    }
    System.out.println(max);
  }
}

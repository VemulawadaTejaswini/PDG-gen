import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int arr[] = new int[M];
    int cnt = 0;
    
    for (int i = 0; i < N; i++) {
      int K = sc.nextInt();
      for (int j = 0; j < K; j++) {
        arr[sc.nextInt()-1]++;
      }
    }
    
    for (int i = 0; i < M; i++) {
      if (arr[i] == N) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
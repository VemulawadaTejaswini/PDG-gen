import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int[] place = new int[100001];
    for (int i = 0; i < M; i++) {
      int tmp = sc.nextInt();
      place[tmp]++;
    }
    int count1 = 0;
    for (int i = 1; i < X; i++) {
      if (place[i] > 0) {
        count1++;
      }
    }
    int count2 = 0;
    for (int i = X + 1; i < N; i++) {
      if (place[i] > 0) {
        count2++;
      }
    }
    System.out.println(Integer.min(count1, count2));
  }
}
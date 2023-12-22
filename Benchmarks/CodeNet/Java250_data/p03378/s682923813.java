import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int start = sc.nextInt();
    int[] cost = new int[M];
    int  countMin = 0;
    int countMax = 0;
    for (int i = 0; i < M; i++) {
      cost[i] = sc.nextInt();
      if (cost[i] >= start) {
        countMax++;
      } else {
        countMin++;
      } 
    }
    System.out.println(Math.min(countMin, countMax));
  }
}
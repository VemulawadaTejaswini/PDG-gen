import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] task = new int[N][2];
    for (int i = 0; i < N; i++) {
      task[i][0] = sc.nextInt();
      task[i][1] = sc.nextInt();
    }
    int time = 0;
    Arrays.sort(task, (a,b) -> a[1]-b[1]);
    for (int i = 0; i < N; i++) {
      if (time + task[i][0] <= task[i][1]) {
        time += task[i][0];
      } else {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }
}

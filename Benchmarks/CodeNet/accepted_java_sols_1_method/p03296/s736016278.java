import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] slimes = new int[n];
    for (int i = 0; i < n; i++) {
      slimes[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 1; i < n - 1; i++) {
      if (slimes[i] == slimes[i - 1] && slimes[i] == slimes[i + 1]) {
        slimes[i] = 101;
      } else if (slimes[i] == slimes[i - 1] && slimes[i] != slimes[i + 1]) {
        slimes[i] = 101;
      }
    }
    if (slimes[n - 1] == slimes[n - 2]) count++;
    for (int i = 0; i < n; i++) {
      if (slimes[i] == 101) {
        count++;
      }
    }
    System.out.println(count);
  }
}
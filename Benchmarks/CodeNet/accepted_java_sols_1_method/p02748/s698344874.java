import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int[] freezers = new int[a];
    int[] microwaves = new int[b];
    int aMin = 1000000000;
    int bMin = 1000000000;
    for (int i = 0; i < a; i++) {
      freezers[i] = sc.nextInt();
    }
    for (int i = 0; i < b; i++) {
      microwaves[i] = sc.nextInt();
    }
    // 割引券なし
    for (int freezer : freezers) {
      aMin = Math.min(aMin, freezer);
    }
    for (int microwave : microwaves) {
      bMin = Math.min(bMin, microwave);
    }
    int ans = aMin + bMin;
    for (int i = 0; i < m; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int c = sc.nextInt();
      int tmp = freezers[x-1] + microwaves[y-1] - c;
      ans = Math.min(ans, tmp);
    }
    System.out.println(ans);
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] box = new int[k];
    int n = 7 % k;
    int ans = 1;
    while (true) {
      if (n == 0) {
        System.out.println(ans);
        break;
      } else if (box[n] == 1) {
        System.out.println("-1");
        break;
      }
      box[n] = 1;
      n = (n * 10 + 7) % k;
      ans++;
    }
  }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] cnt = new int[100010];
    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      cnt[tmp]++;
      cnt[tmp + 1]++;
      cnt[tmp + 2]++;
    }

    Arrays.sort(cnt);
    System.out.println(cnt[cnt.length - 1]);

  }
}
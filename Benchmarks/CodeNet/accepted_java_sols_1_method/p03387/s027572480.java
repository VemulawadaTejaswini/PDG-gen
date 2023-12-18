import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] abc = new int[3];
    for (int i = 0; i < 3; i++) {
      abc[i] = scanner.nextInt();
    }
    scanner.close();
    Arrays.sort(abc);
    int min = abc[0];
    int mid = abc[1];
    int max = abc[2];
    int ans = 0;
    if ((mid - min) % 2 != 0) {
      ans++;
      min++;
      max++;
    }
    ans += (2 * max - mid - min) / 2;
    System.out.println(ans);
  }

}

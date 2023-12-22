import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.close();
    int sum = 0;
    int[] list = {0,0,0};
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= k; j++) {
        for (int j2 = 1; j2 <= k; j2++) {
          list[0] = i;list[1] = j;list[2] = j2;
          Arrays.sort(list);
          sum += gcd(list);
        }
      }
    }

    System.out.println(sum);
  }

  public static int gcd(int[] list) {
    if (list[1]%list[0] == 0 && list[2]%list[0] == 0) {
      return list[0];
    } else {
      for (int i = list[0]/2; i > 0; i--) {
        if (list[0]%i != 0) continue;
        if (list[1]%i == 0 && list[2]%i == 0) {
          return i;
        }
      }
      return 1;
    }
  }
}
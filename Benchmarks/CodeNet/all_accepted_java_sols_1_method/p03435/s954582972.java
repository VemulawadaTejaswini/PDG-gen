import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int[][] arr = new int[3][3];
      int[] a = new int[3];//𝑎1, 𝑎2, 𝑎3,
      int[] b = new int[3];//𝑏1, 𝑏2, 𝑏3
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      // 1つ分かれば（ex. 𝑎1=xと仮定すると）他のa,bもxの式で表せられる
      // それで、a1=x+?=0となるxがあるとすると、a1=と仮定して他のa,bもxの式で表せられる・・・はず
      a[0] = 0;
      for (int i = 0; i < 3; i++)
        b[i] = arr[0][i] - a[0];// 𝑏𝑖 = 𝑐1,𝑖 − 𝑎1
      for (int i = 0; i < 3; i++)
        a[i] = arr[i][0] - b[0];

      boolean isGood = true;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (arr[i][j] != a[i] + b[j]) {
            isGood = false;
          }
        }
      }
      System.out.println(isGood ? "Yes" : "No");
    }

  }
}

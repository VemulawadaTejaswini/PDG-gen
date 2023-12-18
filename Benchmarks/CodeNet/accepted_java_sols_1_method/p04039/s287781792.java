import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int d[] = new int[k];

    for (int i = 0; i < k; i++) {
      d[i] = sc.nextInt();
    }

    int n_max = 100000;

    for (int i = n; i < n_max; i++) {
      String nStr = String.valueOf(i);

      boolean isInclude = false;
      for (int j = 0; j < d.length; j++) {
        String dStr = String.valueOf(d[j]);
        if (nStr.contains(dStr)) {
          isInclude = true;
          break;
        }
      }

      if (!isInclude) {
        System.out.println(i);
        break;
      }
    }
  }
}
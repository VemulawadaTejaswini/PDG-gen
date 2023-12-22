import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, f, r;

    for (int i = 0;; i++) {
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      if (m == -1 && f == -1 && r == -1) {// 入力の終了
        break;
      } else if (m == -1 || f == -1) {// 中間、期末いずれかを欠席F
        System.out.printf("F\n");
      } else if (m + f >= 80){// 合計80以上A
        System.out.printf("A\n");
      } else if (m + f >= 65){// 合計65以上B
        System.out.printf("B\n");
      } else if (m + f >= 50 || (m + f >= 30 && r >=50)){// 合計50以上、または30以上追試50以上C
        System.out.printf("C\n");
      } else if (m + f >= 30){// 合計30以上D
        System.out.printf("D\n");
      } else {// それ以外F
        System.out.printf("F\n");
      }
    }

    sc.close();
  }
}


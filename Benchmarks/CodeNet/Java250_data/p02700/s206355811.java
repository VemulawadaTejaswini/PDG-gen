import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        // 高橋、青木モンスター設定
        int takaMHp = s.nextInt();
        final int TAKA_M_ATK = s.nextInt();
        int aokiMHp = s.nextInt();
        final int AOKI_M_ATK = s.nextInt();

        int x = 1;
        while (true) {
            if (x % 2 == 1) {
                // 高橋ターン
                aokiMHp -= TAKA_M_ATK;
            } else {
                // 青木ターン
                takaMHp -= AOKI_M_ATK;
            }

            if (aokiMHp <= 0 || takaMHp <= 0) {
                break;
            }
            x += 1;
        }

        if (takaMHp > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
  }
}
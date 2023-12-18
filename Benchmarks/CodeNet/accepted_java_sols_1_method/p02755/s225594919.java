
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数値の入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        int roop = 0;
        // 最小から求める
        while (roop < 10000) {
            if (Math.floor((double) roop * 0.08) == a && Math.floor((double) roop * 0.1) == b) {
                System.out.println(roop);
                break;
            }
            roop++;
        }

        if (roop == 10000) {
            System.out.println(-1);
        }

    }
}

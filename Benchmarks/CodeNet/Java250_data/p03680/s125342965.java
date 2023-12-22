import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// ボタンの数
        int[] button = new int[n];

        for (int i = 0; i < n; i++) {
            button[i] = sc.nextInt();
        }

        int count = 0;
        int nextButtonIndex = 0;
        while (n > 0) {
            count++;// ボタンをおす
            n--;
            if (button[nextButtonIndex] == 2) break;

            // 次のボタンへ遷移
            nextButtonIndex = button[nextButtonIndex]-1;
        }

        if (n == 0 && button[nextButtonIndex] != 2) count = -1;

        System.out.println(count);
    }
}

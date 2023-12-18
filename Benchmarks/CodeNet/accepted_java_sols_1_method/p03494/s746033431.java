import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;

        // Aの要素を取得する
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // 要素に奇数が含まれるまで処理を続ける
        int flg = 0;
        do {
            for (int i = 0; i < list.size(); i++) {
                int elem = list.get(i);
                if (elem % 2 != 0) {
                    flg = 1;
                } else {
                    list.set(i, elem / 2);
                }
            }

            if (flg == 0) {
                ans++;
            }
        } while (flg == 0);

        System.out.println(ans);

    }
}
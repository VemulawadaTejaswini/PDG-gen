import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();// 料金所の数
        int x = sc.nextInt();// 今いる場所

        HashMap<Integer, Boolean> box = new HashMap<>();
        // 初期化
        for (int i = 0; i <= n; i++) {
            box.put(i, false);
        }

        for (int i = 0; i < m; i++) {
            int tmpShop = sc.nextInt();// 料金所の場所
            box.put(tmpShop, true);
        }

        int costRight = 0;// マスを右に移動
        for (int i = x; i <= n; i++) {
            if ((boolean)box.get(i) == true) costRight++;
        }

        int costLeft = 0;// マスを左に移動
        for (int i = x; i > 0; i--) {
            if ((boolean)box.get(i) == true) costLeft++;
        }

        System.out.println(Math.min(costLeft, costRight));
    }
}

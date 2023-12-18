import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            // 入力
            Scanner sc = new Scanner(System.in);
            Map<Integer, Integer> targetAndResult = new LinkedHashMap<Integer, Integer>();
            while (sc.hasNext()) {
                targetAndResult.put(sc.nextInt(), 0);
            }

            // 席
            int[] chairs = new int[17];
            // 待ち行列
            Deque<Integer> customers = new LinkedList<Integer>();
            // 店に来た客グループ数
            int cameGroupCount = 0;
            // 経過時間数
            int pastMinutes = 0;
            // 座れた客グループ数
            int sitGroupCount = 0;

            // 1ループ = 1分
            while (sitGroupCount <= 100) {

                // 客が来る
                boolean isCustomerCame = comeCustomer(customers, pastMinutes,
                        cameGroupCount);

                // 食べる
                eat(chairs);

                // 席に着く
                int sitCustomerOnMinute = sit(chairs, customers, cameGroupCount);

                // 後処理
                if (isCustomerCame) {
                    cameGroupCount++;
                }

                // 座れた人の時間の計測
                for (int i = 1; i <= sitCustomerOnMinute; i++) {
                    if (targetAndResult.containsKey(sitGroupCount)) {
                        int waitMinutes = pastMinutes - (5 * (sitGroupCount));

                        targetAndResult.put(sitGroupCount, waitMinutes);
                    }

                    sitGroupCount++;
                }

                pastMinutes++;

            }

            for (Entry<Integer, Integer> entry : targetAndResult.entrySet()) {
                System.out.println(entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    private static boolean comeCustomer(Deque<Integer> customers, int minutes,
            int cameGroupCount) {
        if (cameGroupCount > 100) {
            // 100人までしか来ない
            return false;
        }

        if (minutes % 5 == 0) {
            // 5分後に到着する
            if (cameGroupCount % 5 == 1) {
                // i%5 = 1のとき5人到着
                customers.offer(5);
            } else {
                // それ以外は2人到着
                customers.offer(2);
            }
            // 客が来た
            return true;
        }

        // 客が来なかった
        return false;
    }

    private static void eat(int[] chairs) {
        for (int i = 0; i < chairs.length; i++) {
            chairs[i] = (chairs[i] - 1) < 0 ? 0 : chairs[i] - 1;
        }
    }

    private static int sit(int[] chairs, Deque<Integer> customers,
            int cameGroupCount) {
        int sitGroupCount = 0;

        Integer firstCustomersNumber = customers.peek();

        if (firstCustomersNumber == null) {
            // 客が待っていない場合には何もしない
            return sitGroupCount;
        }

        int sequencialChair = 0;
        int sittableChairStart = 0;
        boolean sittable = false;
        for (int i = 0; i < chairs.length; i++) {
            // 席が空いているかどうかを判定
            if (chairs[i] == 0) {
                sequencialChair++;
            } else {
                sequencialChair = 0;
            }

            if (sequencialChair >= firstCustomersNumber) {
                // 連続した席数が必要数に達していたら、その時点のインデックスを返却
                sittableChairStart = i - (firstCustomersNumber - 1); // 必要席数なので、-1
                sittable = true;
                break;
            }
        }

        if (!sittable) {
            // 座れる席が無かった
            return sitGroupCount;
        }

        // 待ち行列から削除して座れた扱いとする
        sitGroupCount++;
        customers.poll();

        for (int j = 0; j < firstCustomersNumber; j++) {
            // 席に所要時間をカウント
            chairs[j + sittableChairStart] = (17 * (cameGroupCount % 2))
                    + (3 * (cameGroupCount % 3)) + 19;
        }

        // まだ座れる可能性があるので、再帰呼出し
        cameGroupCount++;
        sitGroupCount += sit(chairs, customers, cameGroupCount);

        // 座れた
        return sitGroupCount;

    }

}
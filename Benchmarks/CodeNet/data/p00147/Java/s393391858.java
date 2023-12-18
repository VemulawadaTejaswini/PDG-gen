import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 対象のグループ番号：待ち時間の形で保持
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> targetCustomer = new HashMap<Integer, Integer>();
        List<Integer> targetCustomerGroupNumbers = new LinkedList<Integer>();
        while (sc.hasNext()) {
            targetCustomerGroupNumbers.add(sc.nextInt());
        }

        // 椅子 客が出るまでの分数を保持する
        int[] chairs = new int[17];
        // 待ち行列 客グループ数を保持する
        Deque<Integer> que = new LinkedList<Integer>();
        // これまでに来た最大のグループ番号
        int cameGroup = 0;
        // これまでに座ったグループの「数」
        int sitGroupCount = 0;
        // 経過時間
        int pastMinutes = 0;

        while (sitGroupCount < 100) {
            // 食べる
            eat(chairs);

            // 客が来る
            boolean customerHasCome = come(que, pastMinutes, cameGroup);

            // 座る
            sitGroupCount += sit(chairs, que, cameGroup);

            // 後処理
            for (Integer targetCustomerGroupNumber : targetCustomerGroupNumbers) {
                if (targetCustomerGroupNumber > (sitGroupCount - 1)) {
                    // まだ座れていない
                    continue;
                }

                if (targetCustomer.containsKey(targetCustomerGroupNumber)) {
                    // もうすでに座っていた
                    continue;
                } else {
                    // この時間で初めて座れた
                    int waitMinutes = pastMinutes
                            - (5 * targetCustomerGroupNumber);
                    targetCustomer.put(targetCustomerGroupNumber, waitMinutes);
                }
            }

            if (customerHasCome) {
                cameGroup++;
            }
            pastMinutes++;
        }

        for (Entry<Integer, Integer> entry : targetCustomer.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    private static void eat(int[] chairs) {
        for (int c = 0; c < chairs.length; c++) {
            chairs[c]--;
            if (chairs[c] < 0) {
                chairs[c] = 0;
            }
        }
    }

    private static boolean come(Deque<Integer> que, int pastMinutes,
            int cameGroup) {
        if (pastMinutes % 5 == 0) {
            if (cameGroup % 5 == 1) {
                que.offer(5);
            } else {
                que.offer(2);
            }
            return true;
        }

        return false;
    }

    private static int sit(int[] chairs, Deque<Integer> que, int cameGroupCount) {
        // 先頭の人を取得
        Integer groupMembers = que.peek();

        if (groupMembers == null) {
            // 待っていなかった場合
            return 0;
        }

        int sequencialEmptyChairs = 0;
        int sittableChairStart = -1;
        for (int c = 0; c < chairs.length; c++) {
            if (chairs[c] == 0) {
                // 空いていたら連続空席数をカウント
                sequencialEmptyChairs++;
            } else {
                sequencialEmptyChairs = 0;
            }

            // 全員座れるまで席が空いていた
            if (sequencialEmptyChairs == groupMembers) {
                sittableChairStart = c - (sequencialEmptyChairs - 1);
                break;
            }
        }

        if (sittableChairStart == -1) {
            // 連続して席が空いていなかった
            return 0;
        }

        // 座れる席を確保
        que.poll();

        for (int c = 0; c < groupMembers; c++) {
            chairs[c + sittableChairStart] = (17 * (cameGroupCount % 2))
                    + (3 * (cameGroupCount % 3)) + 19;
        }

        // まだ座れるかも
        int sitGroupCount = 1;
        sitGroupCount += sit(chairs, que, cameGroupCount + sitGroupCount);

        return sitGroupCount;
    }

}
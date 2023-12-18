import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /** 対象外 */
    private static final int EXEMPT = -1;

    /** グループ数 */
    private static final int GROUP_NUM = 100;

    /** 標準入力 */
    private static BufferedReader br;

    /** 座席数 最後の座席番号 */
    private static int seatsNum, firstSeatNum;

    /** 到着時間 客数 食事時間 待ち時間 */
    private static int[] arriveMinutes, customersNum, mealMinutes, waitMinutes;

    /** 座席 */
    private static String[] seats;

    /** 初期化 */
    static {

        br = new BufferedReader(new InputStreamReader(System.in));
        seatsNum = 17;
        arriveMinutes = new int[GROUP_NUM];
        customersNum = new int[GROUP_NUM];
        mealMinutes = new int[GROUP_NUM];
        waitMinutes = new int[GROUP_NUM];
        seats = new String[seatsNum];

        for (int i = 0; i < GROUP_NUM; i++) {
            // グループ数分繰り返す

            // 到着時間
            arriveMinutes[i] = 5 * i;

            // 人数
            customersNum[i] = i % 5 == 1 ? 5 : 2;

            // 食事時間
            mealMinutes[i] = seatsNum * (i % 2) + 3 * (i % 3) + 19;

        }

        // 待ち時間を作成
        createWaitTimes();

    }

    /** 待ち時間を作成する */
    private static void createWaitTimes() {
        // 順番
        int groupOrder;

        // 行列リスト
        List<Integer> waitList = new ArrayList<Integer>();

        // 行列排除リスト
        List<Integer> removeList = new ArrayList<Integer>();

        for (int currentTime = 0, totalGroupNum = 0; totalGroupNum < GROUP_NUM; currentTime++) {
            // 行列が終了するまで、一分毎に繰り返す

            // 食事の時間が終了した客を離席させる
            outCustomer(currentTime);

            if ((groupOrder = searchArrivedGroup(arriveMinutes, currentTime)) != EXEMPT) {
                // 到着時間の場合

                // 到着したグループを着席させる
                seatArrivedGroup(groupOrder, waitList, totalGroupNum);
            }

            if (!waitList.isEmpty()) {
                // 行列がある場合

                // 並んでいる行列のグループを着席させる
                seatWaitList(waitList, removeList, currentTime, totalGroupNum);
            }

            if (!removeList.isEmpty()) {
                // 行列排除リストに着席したグループが追加されていた場合

                // 行列リストから着席したグループを排除する
                removeSeatingGroupFromWaitList(waitList, removeList);
                // 初期化
                removeList = new ArrayList<Integer>();
            }
        }
    }

    /** 到着したグループを着席させる */
    private static void seatArrivedGroup(int groupOrder,
            List<Integer> waitList, int totalGroupNum) {
        if (waitList.isEmpty()) {
            // 行列がない場合

            if (isEmpty(groupOrder)) {
                // 着席可能の場合

                // 座席に着席させる
                setSeat(Integer.toString(groupOrder));

                totalGroupNum++;

            } else {
                // 着席不可の場合

                // 行列に並ばせる
                waitList.add(groupOrder);
            }

        } else {
            // 行列がある場合

            // 行列に並ばせる
            waitList.add(groupOrder);
        }
    }

    /** 着席可能の場合、並んでいる行列のグループを着席させる */
    private static void seatWaitList(List<Integer> waitList,
            List<Integer> removeList, int currentTime, int totalGroupNum) {
        // 行列番号
        int i = 0;

        for (int wait : waitList) {
            // 行列リスト分、繰り返す

            if (isEmpty(wait)) {
                // 着席可能の場合

                // 座席に着席させる
                setSeat(Integer.toString(wait));

                totalGroupNum++;

                // 待った時間を設定する
                waitMinutes[wait] = currentTime - arriveMinutes[wait];

                // 着席したグループを行列排除リストに追加する
                removeList.add(i);

            } else {
                // 着席不可の場合

                // 行列の先頭が着席できないため、残りの行列も着席不可にする。
                break;
            }
            i++;
        }
    }

    /** 行列リストから着席したグループを排除する */
    private static void removeSeatingGroupFromWaitList(List<Integer> waitList,
            List<Integer> removeList) {
        // リストの降順でソートする（リムーブするため）
        Collections.reverse(removeList);

        for (int remove : removeList) {
            // 行列排除リスト分、繰り返す

            // 行列リストから行列排除リストの番号を削除する
            waitList.remove(remove);
        }
    }

    /** メイン */
    public static void main(String[] args) throws IOException {
        String line;
        List<Integer> inputList = new ArrayList<Integer>();

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            inputList.add(Integer.parseInt(line));
        }
        for (int input : inputList) {
            System.out.println(waitMinutes[input]);
        }

    }

    /** 現在時間に到着するグループ番号を検索し返す */
    private static int searchArrivedGroup(int[] targets, int currentTime) {
        int order = 0;
        for (int target : targets) {
            if (target == currentTime) {
                return order;
            }
            order++;
        }
        return EXEMPT;
    }

    /** 離席させる */
    private static void outCustomer(int currentTime) {

        // 席番
        int seatNum = 0;

        for (String seat : seats) {
            // 座席数分繰り返す

            if (seat == null) {
                // 空席の場合
                seatNum++;
                continue;
            }

            if (finishedMeal(currentTime, seat)) {
                // 食事の時間が終了した場合

                // 空席にする
                seats[seatNum] = null;
            }
            seatNum++;
        }

    }

    /** 食事時間が終了した場合、trueを返す */
    private static boolean finishedMeal(int currentTime, String seat) {
        return currentTime
                - (arriveMinutes[Integer.parseInt(seat)] + waitMinutes[Integer
                        .parseInt(seat)]) >= mealMinutes[Integer.parseInt(seat)];
    }

    /** 着席させる */
    private static void setSeat(String groupsNum) {

        for (int count = 0; count < customersNum[Integer.parseInt(groupsNum)]; count++) {
            // 着席する人数分繰り返す

            // 座席にグループ番号を設定する
            seats[firstSeatNum++] = groupsNum;
        }
    }

    /** 引数のグループ番号の客数分、空席の場合、trueを返す。 */
    private static boolean isEmpty(int groupsNum) {

        // 空席数
        int totalEmptySeats = 0;

        // 座席番号
        int seatNum = 0;

        for (; seatNum < seatsNum
                || customersNum[groupsNum] <= seatsNum - seatNum; seatNum++) {
            // 残座席数が客の数以下になるまで座席数分繰り返す

            if (totalEmptySeats == customersNum[groupsNum]) {
                // 連続した空席が客の数だけあった場合
                break;

            }

            if (seats[seatNum] == null) {
                // 空席かつ繰り返す席が顧客数分以上存在する場合

                totalEmptySeats++;

                continue;

            } else {
                // 空席でない場合

                // 空席数を初期化
                totalEmptySeats = 0;
            }
        }
        if (totalEmptySeats == customersNum[groupsNum]) {
            // 空席の最初の座席番号を設定する
            firstSeatNum = seatNum - totalEmptySeats;

            return true;
        }

        return false;
    }
}
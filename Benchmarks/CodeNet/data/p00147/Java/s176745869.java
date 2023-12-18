import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    // 店のカウンター
    static int[] serviceCounters;
    // 次に到着するグループ番号
    static int nextArrivalGroupNumber;
    // 待ち行列作成(到着したグループを格納)
    static LinkedList<Integer> waitGroupNumberList;
    // 正午から現在までの経過時間（分）
    static int currentTime;

    // 各グループの情報を登録（添え字はグループ番号を表す）
    // グループの人数
    static List<Integer> groupNumberOfPeopleList;
    // 店に到着する時間（分）
    static List<Integer> arrivalTimeList;
    // 食事時間（分）
    static List<Integer> eatTimeList;
    // 席に着いた時間（分）
    static List<Integer> sitTimeList;
    // 待ち時間（分）
    static List<Integer> waitTimeList;

    // 初期化
    public static void init() {
        serviceCounters = new int[17];
        // 空席を"-1"とするため、"-1"で初期化
        Arrays.fill(serviceCounters, -1);
        nextArrivalGroupNumber = 0;
        waitGroupNumberList = new LinkedList<Integer>();
        currentTime = 0;
        groupNumberOfPeopleList = new ArrayList<Integer>();
        arrivalTimeList = new ArrayList<Integer>();
        eatTimeList = new ArrayList<Integer>();
        sitTimeList = new ArrayList<Integer>();
        waitTimeList = new ArrayList<Integer>();
    }

    public static void main(String[] args) {

        // 入力値を一行分取得する。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer inputNumber = null;
        while (true) {
            String inputStr = null;
            try {
                inputStr = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputStr == null) {
                break;
            }
            inputNumber = Integer.valueOf(inputStr);
            // 変数の初期化
            init();
            // 各グループの情報を登録する。（入力されたグループ番号まで）
            for (int i = 0; i <= inputNumber; i++) {
                arrivalTimeList.add(calArrivalTime(i));
                groupNumberOfPeopleList.add(calgroupNumberOfPeople(i));
                eatTimeList.add(calEatTime(i));
            }

            // メイン処理開始
            while (true) {
                // 次に到着するグループがいるか調べ、いれば待ち行列の最後尾にセットする
                if (inputNumber >= nextArrivalGroupNumber) {
                    if (currentTime == arrivalTimeList.get(nextArrivalGroupNumber)) {
                        waitGroupNumberList.offer(nextArrivalGroupNumber);
                        nextArrivalGroupNumber++;
                    }
                }

                // 食べ終わったグループに退店される
                exitGroup();

                // 待っているグループがいれば着席させる
                sitGroup();

                currentTime++;

                // 終了条件
                // 入力されたグループ番号まで客を入店させ、最後のグループが着席（待ち行列が空）すれば終了。
                if ((inputNumber + 1) == nextArrivalGroupNumber && waitGroupNumberList.isEmpty()) {
                    break;
                }
            }
            System.out.println(waitTimeList.get(inputNumber));
        }
    }

    /**
     * 
     * <p> [機能] 食べ終わったグループがいればに退店させる。</p>
     * <p> [説明] グループが着席してからの経過時間を調べ、食事時間と一致すれば退店させる。</p>
     */
    private static void exitGroup() {
        for (int i = 0; i < serviceCounters.length; i++) {
            if (serviceCounters[i] != -1) {
                // 食事が終了したか判定
                if (eatTimeList.get(serviceCounters[i]) == (currentTime - sitTimeList.get(serviceCounters[i]))) {
                    int emptyCounter = serviceCounters[i];
                    // グループの人数分空席にする
                    for (int j = 0; j < groupNumberOfPeopleList.get(emptyCounter); j++) {
                        serviceCounters[i + j] = -1;
                    }
                }
            }
        }
    }

    /**
     * 
     * <p> [機能] 空席があれば待っているグループに座らせる。</p>
     * <p> [説明] 待ち行列の先頭のグループと店の空席を確認し、座らせる。</p>
     * <p> [備考] 着席時間と待ち時間を設定する。</p>
     */
    private static void sitGroup() {
        while (!(waitGroupNumberList.isEmpty())) {
            int firstWaitGroupNumber = waitGroupNumberList.poll();
            int firstCountNumber = getSeriesChairs(firstWaitGroupNumber);
            // 座れる席がない場合
            if (firstCountNumber == -1) {
                // 待ち行列にグループを戻す
                waitGroupNumberList.addFirst(firstWaitGroupNumber);
                break;
            }
            for (int i = 0; i < groupNumberOfPeopleList.get(firstWaitGroupNumber); i++) {
                serviceCounters[firstCountNumber + i] = firstWaitGroupNumber;
            }
            // 着席時間を設定
            sitTimeList.add(currentTime);
            // 待ち時間を設定
            waitTimeList.add(currentTime - arrivalTimeList.get(firstWaitGroupNumber));

        }
    }

    /**
     * 
     * <p> [機能] カウンターの先頭から空席を調べ、<br>
     *                    連続した空席が入力値以上になれば連続した空席の最も小さい席番号を返す。<br>
     *                    それ以外は-1を返す。</p>
     *@param firstWaitGroupNumber グループ番号
     * @return  連続空席の最も小さい席番号
     */
    private static int getSeriesChairs(int firstWaitGroupNumber) {
        for (int startPoint = 0; startPoint < serviceCounters.length; startPoint++) {
            if (serviceCounters[startPoint] == -1) {
                int emptyCount = 1;
                for (int endpoint = startPoint + 1; endpoint < serviceCounters.length; endpoint++) {
                    // 空席ならカウント
                    if (serviceCounters[endpoint] == -1) {
                        emptyCount++;
                        // 連続空席がグループの人数以上か判定
                        if (emptyCount >= groupNumberOfPeopleList.get(firstWaitGroupNumber)) {
                            return startPoint;
                        }
                    } else {
                        startPoint = endpoint + 1;
                        break;
                    }

                }
            }
        }
        // 座れる席がない場合は-1を返す
        return -1;
    }

    /**
     * <p> [機能] グループの人数を計算する。 </p>
     */
    public static int calgroupNumberOfPeople(int GroupNumber) {
        if (GroupNumber % 5 == 1) {
            return 5;
        }
        return 2;
    }

    /**
     * <p> [機能] 食事時間を計算する。 </p>
     */
    public static int calEatTime(int GroupNumber) {
        return 17 * (GroupNumber % 2) + 3 * (GroupNumber % 3) + 19;
    }

    /**
     * <p> [機能] 店への到着時間の計算する。 </p>
     */
    public static int calArrivalTime(int GroupNumber) {
        return GroupNumber * 5;
    }

    /**
     * <p> [機能] 到着したグループ番号に1を加算する。</p>
     * @param arrivaledGroupNumber 到着したグループ番号
     */
    public static void addNextArrivaledGroupNumber(Integer arrivaledGroupNumber) {
        nextArrivalGroupNumber++;
    }

}
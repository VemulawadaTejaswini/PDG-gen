import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exec();
    }

    private static void exec() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n番目グループ
        int baseTime = 0; // 基準時間
        int addGroupNo = -1; // 入店したグループNo
        int groupMember = 0; // 入店したグループ人数
        int blankStartSeatNo = -1; // 空席No

        // 座席状態の初期化
        Map<Integer, GroupStatus> seatStatusMap = initSeatStatus();

        // 待ち行列の初期化
        LinkedList<GroupStatus> queueStatusList = new LinkedList<GroupStatus>();

        while (addGroupNo != n) {

            // 座席の状態更新
            updateSeatStatus(seatStatusMap, baseTime);

            // 待ち行列の状態更新
            updateQueueStatus(queueStatusList, baseTime);

            int waitGroupSize = queueStatusList.size();

            for (int i = 0; i < waitGroupSize; i++) {

                // 待ち行列の先頭グループ人数取得
                groupMember = queueStatusList.peek().groupMember;

                // 空席シートNoの取得
                blankStartSeatNo = getBlankStartSeatNo(seatStatusMap, baseTime, groupMember);

                if (blankStartSeatNo >= 0) {

                    // 座席に先頭グループ追加
                    addGroupNo =
                        addSeat(seatStatusMap, queueStatusList.peek(), baseTime, blankStartSeatNo,
                            n);

                    // 待ち行列の先頭グループ削除
                    queueStatusList.remove();

                } else {

                    // 座れる座席なし
                    break;
                }
            }

            baseTime++;
        }
    }

    /** n番目のグループ人数 */
    private static int getGroupMember(int i) {

        int result = i % 5;

        // i%5 の結果が1であれば5を、1でなければ2を返却
        if (result == 1) {
            return 5;
        } else {
            return 2;
        }
    }

    /** n番目のグループの食事時間 */
    private static int getMealTime(int i) {

        int result = (17 * (i % 2)) + (3 * (i % 3)) + 19;
        return result;
    }

    /** 待ち行列の状態更新 */
    private static void updateQueueStatus(LinkedList<GroupStatus> queueStatusList, int time) {

        // 待ち行列の更新
        for (GroupStatus queueStatus : queueStatusList) {

            queueStatus.endStayTime = time;
        }

        // 待ち行列の追加
        if (time == 0) {

            // 初回
            int groupNo = 0;
            int groupMember = getGroupMember(groupNo);

            GroupStatus queueStatus = new GroupStatus(groupNo, groupMember, time, time, true);
            queueStatusList.offer(queueStatus);

        } else if (time % 5 == 0) {

            // 初回以降
            int groupNo = time / 5;
            int groupMember = getGroupMember(groupNo);

            GroupStatus queueStatus = new GroupStatus(groupNo, groupMember, time, time, true);
            queueStatusList.offer(queueStatus);
        }
    }

    /** 座席状態の初期化 */
    private static Map<Integer, GroupStatus> initSeatStatus() {

        int seatNo = 17;
        Map<Integer, GroupStatus> seatStatusMap = new HashMap<Integer, GroupStatus>(seatNo);

        for (int i = 0; i < seatNo; i++) {
            GroupStatus seatStatus = new GroupStatus(-1, 0, 0, 0, false);
            seatStatusMap.put((Integer) i, seatStatus);
        }

        return seatStatusMap;
    }

    /** 座席状態の更新 */
    private static void updateSeatStatus(Map<Integer, GroupStatus> seatStatusMap, int time) {

        for (int i = 0; i < 17; i++) {

            if (seatStatusMap.get(i).isStay) {

                // 座席に客がいる場合

                seatStatusMap.get(i).endStayTime = time;

                if ((seatStatusMap.get(i).endStayTime - seatStatusMap.get(i).startStayTime) == getMealTime(seatStatusMap
                    .get(i).groupNo)) {

                    // 滞在時間から着席時間を減算した値が食事時間と一致した場合

                    // 座席ステータスを初期化
                    seatStatusMap.get(i).groupNo = -1;
                    seatStatusMap.get(i).groupMember = 0;
                    seatStatusMap.get(i).startStayTime = 0;
                    seatStatusMap.get(i).endStayTime = 0;
                    seatStatusMap.get(i).isStay = false;
                }
            }
        }
    }

    /** 空席シートの取得 */
    private static int getBlankStartSeatNo(Map<Integer, GroupStatus> seatStatusMap, int time,
            int groupMember) {

        int blankStartSeat = -1; // 空席開始No
        int blankEndSeat = -1; // 空席終了No
        boolean isCount = false; // 空席集計フラグ
        boolean isEnableSeat = false; // 着席可能フラグ

        for (int i = 0; i < 17; i++) {

            if (!seatStatusMap.get(i).isStay) {

                // 座席に客がいない場合

                isCount = true;

                if (blankStartSeat == -1) {

                    blankStartSeat = i;
                }

                blankEndSeat = i;

                if ((blankEndSeat - (blankStartSeat - 1)) >= groupMember) {

                    isEnableSeat = true;
                    break;
                }

            } else {

                // 座席に客がいる場合

                if (isCount) {

                    blankEndSeat = i;

                    if (((blankEndSeat - 1) - blankStartSeat) >= groupMember) {

                        isEnableSeat = true;
                        break;
                    }

                    // 初期化
                    blankStartSeat = -1;
                    blankEndSeat = -1;
                    isCount = false;
                }
            }
        }

        if (isEnableSeat) {

            return blankStartSeat;
        }

        return -1;
    }

    /** 座席に先頭グループ追加 */
    private static int addSeat(Map<Integer, GroupStatus> seatStatusMap, GroupStatus queueStatus,
            int baseTime, int blankStartSeatNo, int n) {

        int groupNo = queueStatus.groupNo;
        int groupMember = queueStatus.groupMember;

        for (int seatNo = blankStartSeatNo; seatNo < (blankStartSeatNo + groupMember); seatNo++) {

            seatStatusMap.get(seatNo).groupNo = groupNo;
            seatStatusMap.get(seatNo).groupMember = groupMember;
            seatStatusMap.get(seatNo).startStayTime = baseTime;
            seatStatusMap.get(seatNo).endStayTime = baseTime;
            seatStatusMap.get(seatNo).isStay = true;
        }

        if (groupNo == n) {

            System.out.println(queueStatus.endStayTime - queueStatus.startStayTime);
        }

        return groupNo;
    }

    static class GroupStatus {

        public int groupNo;
        public int groupMember;
        public int startStayTime;
        public int endStayTime;
        public boolean isStay;

        public GroupStatus() {

        }

        public GroupStatus(int groupNo, int groupMember, int startStayTime, int endStayTime,
                boolean isStay) {
            this.groupNo = groupNo;
            this.groupMember = groupMember;
            this.startStayTime = startStayTime;
            this.endStayTime = endStayTime;
            this.isStay = isStay;
        }
    }
}
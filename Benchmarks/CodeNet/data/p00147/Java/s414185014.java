import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
        // 店内の座席を作成する。0が空席,1行目が席、2行目が着席時刻、3行目が食事時間
        int[][] seats = new int[17][3];
        for (int count = 0; count < 17; count++) {
            for (int doneTime = 0; doneTime < 3; doneTime++) {
                seats[count][doneTime] = 0;
            }
        }

        // 空席がなかった人たちを格納するリスト
        List<String> waitingCustomersList = new ArrayList<String>();
        //最終的に出力する値
        List<String> list = new ArrayList<String>();
        //待ち行列
        List<String> waitingStartTimeList = new ArrayList<String>();
        //出力されるグループ
        List<String> appointedGroupList = new ArrayList<String>();

        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));

        int group = 0;
        int timeGoesBy = 0;
        int numberOfCustomer = 0;

        while (true) {
            String inputData = input.readLine();
            // 入力データがnullもしくは空文字の時、ループを抜ける
            if (inputData == null || inputData.equals("")) {
                break;
            }
            appointedGroupList.add(inputData);
        }

        while (true) {
            // 食べ終わった客に出て行ってもらいたい
            seats = getoutCustomer(seats, timeGoesBy);
            int countDelete = 0;
            // 待ってる人たちに座ってもらう
            for (int count = 0; count < waitingCustomersList.size(); count++) {
                numberOfCustomer = getNumberOfHuman(Integer
                        .parseInt(waitingCustomersList.get(count)));

                if (isSeatsAvailable(seats, numberOfCustomer, timeGoesBy,
                        Integer.parseInt(waitingCustomersList.get(count)))) {
                    seats = getSeats(seats, numberOfCustomer, timeGoesBy,
                            Integer.parseInt(waitingCustomersList.get(count)));
                    countDelete++;
                    //各グループの待ち時間を計算し、リストに格納する
                    for (String appointedGroup : appointedGroupList) {
                        if (Integer.parseInt(waitingCustomersList.get(count)) == Integer
                                .parseInt(appointedGroup)) {
                            list.add(Integer.toString(timeGoesBy
                                    - Integer.parseInt(waitingStartTimeList
                                            .get(count))));
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            //席についた客と時間をリストから削除する
            for (int countt = 0; countt < countDelete; countt++) {
                waitingCustomersList.remove(0);
                waitingStartTimeList.remove(0);
            }
            // 客がくる
            if (timeGoesBy % 5 == 0 || timeGoesBy == 0) {
                // 客の人数を取得する
                numberOfCustomer = getNumberOfHuman(group);
                if (waitingCustomersList.isEmpty()) {
                    // 空席があるか判定し、あれば着席させる、なければ待ち行列に追加する
                    if (isSeatsAvailable(seats, numberOfCustomer, timeGoesBy,
                            group)) {
                        seats = getSeats(seats, numberOfCustomer, timeGoesBy,
                                group);
                        // 指定された番号の待ち時間を取得する
                        for (int countLoop = 0; countLoop < appointedGroupList
                                .size(); countLoop++) {
                            if (group == Integer.parseInt(appointedGroupList
                                    .get(countLoop))) {
                                list.add(Integer.toString(0));
                            }
                        }
                    } else {
                        waitingCustomersList.add(Integer.toString(group));
                        waitingStartTimeList.add(Integer.toString(timeGoesBy));
                    }
                } else {
                    waitingCustomersList.add(Integer.toString(group));
                    waitingStartTimeList.add(Integer.toString(timeGoesBy));
                }
                group++;
            }
            timeGoesBy++;

            if (list.size() == appointedGroupList.size()) {
                break;
            }
        }
        for (String waitingTime : list) {
            System.out.println(Integer.parseInt(waitingTime));
        }
    }

    // 客が着席できるか判定し、可能であれば着席させる
    static int[][] getSeats(int[][] seats, int numberOfCustomer,
            int timeGoesBy, int group) {
        int countAvailableSeats = 0;
        int count = 0;
        for (int[] seat : seats) {
            if (seat[0] == 0) {
                countAvailableSeats++;
            } else {
                countAvailableSeats = 0;
            }
            count++;
            if (countAvailableSeats == numberOfCustomer) {
                for (int count1 = count - numberOfCustomer; count1 < count; count1++) {
                    seats[count1][0] = 1;
                    seats[count1][1] = timeGoesBy;
                    seats[count1][2] = 17 * (group % 2) + 3 * (group % 3) + 19;
                }
                return seats;
            }
        }
        return seats;
    }

    //着席可能か判断する
    static boolean isSeatsAvailable(int[][] seats, int numberOfCustomer,
            int timeGoesBy, int group) {
        int countAvailableSeats = 0;
        for (int[] seat : seats) {
            if (seat[0] == 0) {
                countAvailableSeats++;
            } else {
                countAvailableSeats = 0;
            }
            if (countAvailableSeats == numberOfCustomer) {
                return true;
            }
        }
        return false;
    }

    // 客の人数を判定する
    static int getNumberOfHuman(int group) {
        int judgeNumver = group % 5;
        if (judgeNumver == 1) {
            return 5;
        } else {
            return 2;
        }
    }

    // 食べ終わった客を退席させる
    static int[][] getoutCustomer(int[][] seats, int timeGoesBy) {
        for (int count = 0; count < 17; count++) {
            if (seats[count][1] + seats[count][2] == timeGoesBy) {
                seats[count][0] = 0;
                seats[count][1] = 0;
                seats[count][2] = 0;

            }
        }
        return seats;
    }
}
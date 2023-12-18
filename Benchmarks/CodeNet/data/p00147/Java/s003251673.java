package fukushimaken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 0147:Fukushimaken
 * 
 * @author MS14A
 * @version 2015/05/09
 */
public class Main {

    /** 席での食事時間の残を格納する配列 */
    private static int[] seatWaitTime = new int[17];

    /**
     * メインメソッド
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // 標準入力読取り。
        List<Integer> inputGroupNumbers = getGroupNumbers();

        for (Integer inputGroupNumber : inputGroupNumbers) {
            // 各席での食事時間を初期化
            Arrays.fill(seatWaitTime, 0);

            // 与えられたグループ番号の待ち時間を算出・表示
            System.out.println(getWaitingTime(inputGroupNumber.intValue()));
        }
    }

    /**
     * 指定された番号のグループの待ち時間を計算し、返却する。
     * 
     * @param inputGroupNumber 指定されたグループ番号
     * @return 待ち時間
     */
    private static int getWaitingTime(int inputGroupNumber) {

        List<Integer> waitingGroups = new ArrayList<Integer>(); // 席待ちのグループを格納するリスト
        int groupNumber = 0; // グループ番号
        boolean canSit = false; // 行列の先頭グループが着席可能ならtrue

        int time = 0; // 経過時間
        int waitingStartTime = 0; // 指定グループが並び始めた時間
        int waitingEndTime = 0; // 指定グループが席に着いた時間

        while (!canSit) {
            // 食事時間を一分消化
            for (int i = 0; i < seatWaitTime.length; i++) {
                if (seatWaitTime[i] > 0) {
                    seatWaitTime[i] -= 1;
                }
            }

            // グループが来る
            if (time % 5 == 0) {
                groupNumber = time / 5;
                waitingGroups.add(Integer.valueOf(groupNumber));

                // 店に来たグループが指定グループなら、待ち時間のカウント開始
                if (groupNumber == inputGroupNumber) {
                    waitingStartTime = time;
                }
            }

            if (!waitingGroups.isEmpty()) {
                // 座れる場合は待ちリストから削除していく
                canSit = sit(getNumberOfGroupMember(waitingGroups.get(0)), getEatingTime(waitingGroups.get(0)));

                while (canSit) {
                    // 席に着いたグループが指定グループの場合、待ち時間をカウントしループ終了
                    if (waitingGroups.get(0) == inputGroupNumber) {
                        waitingEndTime = time;
                        break;
                    }
                    
                    // 席に着いたグループを待ちグループのリストから削除
                    waitingGroups.remove(0);
                    if (waitingGroups.isEmpty()) {
                        canSit = false;
                    } else {
                        // 次の待ちグループがいた場合、席に着けるか確認
                        canSit = sit(getNumberOfGroupMember(waitingGroups.get(0)), getEatingTime(waitingGroups.get(0)));
                    }
                }
            }

            ++time;
        }

        return waitingEndTime - waitingStartTime;
    }

    /**
     * グループを席に着かせる<br>
     * <br>
     * 【説明】<br>
     *  グループの人数分だけ連続した空席があるか確認し、空席が存在すれば<br>
     *  グループの食事時間を配列に格納する。
     * 
     * @param NumberOfGroupMember グループの人数
     * @param eatingTimeOfGroup グループの食事時間
     * @return グループの人数分空席があればtrue、空席がなければfalse
     */
    private static boolean sit(int NumberOfGroupMember, int eatingTimeOfGroup) {
        int count = 0;
        for (int i = 0; i < seatWaitTime.length; ++i) {
            if (seatWaitTime[i] == 0) {
                count += 1;
                
                // 空席が人数分連続していれば、人数分の食事時間を配列に格納(＝席に着かせる)
                if (count == NumberOfGroupMember) {
                    Arrays.fill(seatWaitTime, i - NumberOfGroupMember + 1, i + 1, eatingTimeOfGroup);
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }

    /**
     * グループの人数を求める。
     * 
     * @param groupNumber グループ番号
     * @return グループの人数
     */
    private static int getNumberOfGroupMember(int groupNumber) {
        if (groupNumber % 5 == 1) {
            return 5;
        }
        return 2;
    }

    /**
     * グループの食事時間を求める。
     * 
     * @param groupNumber グループ番号
     * @return グループの食事時間
     */
    private static int getEatingTime(int groupNumber) {
        return 17 * (groupNumber % 2) + 3 * (groupNumber % 3) + 19;
    }

    /**
     * 標準入力から待ち時間を計算するグループ番号を読取り、リストで返却する。
     * 
     * @return グループ番号のリスト
     * @throws IOException
     */
    private static List<Integer> getGroupNumbers() throws IOException {
        // 入力読取り
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String line = null;
        List<Integer> groupNumbers = new ArrayList<Integer>();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                groupNumbers.add(Integer.parseInt(line));
            }
            return groupNumbers;
            
        } finally {
            bufferedReader.close();
            streamReader.close();
        }
    }
}
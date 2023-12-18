import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
/**
 * Fukushimaken
 */
public class Main{
    /** 食べ終わるまでの時間 */
    private static final int[] timeToEatList = {19, 39, 25, 36, 22, 42};
    /** 座席数 */
    private static final int SEAT_NUM = 17;
    /** 来店するグループ数 */
    private static final int GROUP_NUM = 100;
    /** 客の到着する間隔 */
    private static final int ARRIVE_INTERVAL = 5;
     
    /** 座席 */
    // -1 は空席、0以上はグループの番号
    private static int[] seat = new int[SEAT_NUM];
    /** 座席毎の食べ終わる時間 */
    //誰もいない場合は-1。 */
    private static int[] eatEndTime = new int[SEAT_NUM];
    /** n番目の客の待ち時間 */
    private static int[] waitingTime = new int[GROUP_NUM];
    /** 先頭で待っているグループ番号 */
    private static int headGroupNo = -1;
     
    static {
        Arrays.fill(waitingTime, -1);
    }
     
    /**
     * エントリポイント
     */
    public static void main(String args[]) throws IOException {        
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
         
        //入力値をまとめて読み込み
        //（入力値中の、最大のグループ番号を求める）
        List<Integer> inputList = new ArrayList<Integer>();
        int maxGroupNum = 0;
        while(true) {
            input = br.readLine();
            if(input == null) break;
             
            int inputInt = Integer.parseInt(input);
            if(maxGroupNum < inputInt) maxGroupNum = inputInt;
             
            inputList.add(Integer.parseInt(input));
        }
         
        //入力値中の、最大のグループ番号までの待ち時間を計算
        calcWaitTime(maxGroupNum);
         
        //結果を表示
        for (int i = 0;  i < inputList.size(); i++) {
            System.out.println(waitingTime[inputList.get(i)]);
        }
 
    }
     
    /**
     * 待ち時間を計算し、waitingTimeに記録する。
     * ただし、入力値中の、最大のグループ番号まで、計算する。
     */
    private static void calcWaitTime(int maxGroupNum) {
        
        for (int min = 0; ; min++) {
 
            //食べ終わりの判定
            for (int s = 0; s < SEAT_NUM; s++) {
                if(eatEndTime[s] == min) {
                    seat[s] = -1;
                    eatEndTime[s] = -1;
                }
            }
             
            //客が到着し、誰も待っていなければ先頭のグループNoを更新
            if (min % 5 == 0 && headGroupNo == -1) {
                headGroupNo = min / ARRIVE_INTERVAL;
            }
             
            //席が空いていれば着席させる
            while(headGroupNo != -1) {
                //連続して空いている席を探索
                int blankSeatNum = 0;
                int numInGroup = headGroupNo % 5 == 1 ? 5 : 2;
                int s;
                for (s = 0; s < SEAT_NUM && blankSeatNum < numInGroup; s++) {
                    int sittingGroupNum = seat[s];
                    if (sittingGroupNum == -1) {
                        blankSeatNum++;
                    } else {
                        blankSeatNum = 0;
                        //グループの人数分飛ばす
                        s += (sittingGroupNum % 5 == 1 ? 5 : 2) - 1;
                    }
                }
 
                //着席できた場合
                if(blankSeatNum == numInGroup) {
                    //席を埋める
                    Arrays.fill(seat, s - numInGroup, s, headGroupNo);
                    Arrays.fill(eatEndTime, s - numInGroup, s, min + timeToEatList[headGroupNo % timeToEatList.length]);
                     
                    //待った時間を記録
                    waitingTime[headGroupNo] = min - headGroupNo * ARRIVE_INTERVAL;
                     
                    //求める最大のグループ番号が着席できた時点で、処理中断。
                    if (headGroupNo == maxGroupNum) return;
                     
                    //次に先頭になるグループを算出
                    if(min >= (headGroupNo + 1) * ARRIVE_INTERVAL) {
                        //次のグループが既に到着していれば、次のグループが先頭
                        headGroupNo++;
                    } else {
                        //まだ到着していなければ、
                        headGroupNo = -1;
                    }
                } else {
                    //着席できない場合、次の時刻に進む
                    break;
                }
            }
        }
    }
}
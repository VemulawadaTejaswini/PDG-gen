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
    /** １グループの人数 */
    public static final int[] numInGroupList = {2, 5, 2, 2, 2};
    /** 食べ終わるまでの時間 */
    public static final int[] timeToEatList = {19, 39, 25, 36, 22, 42};
    /** 座席数 */
    public static final int SEAT_NUM = 17;
    /** 来店するグループ数 */
    public static final int GROUP_NUM = 100;
    /** 客の到着する間隔 */
    public static final int ARRIVE_INTERVAL = 5;
    
    /** 座席 */
    // -1 は空席、0以上はグループの番号
    public static int[] seat = new int[SEAT_NUM];
    /** 座席毎の食べ終わる時間 */
    //誰もいない場合は-1。 */
    public static int[] eatEndTime = new int[SEAT_NUM];
    /** n番目の客の待ち時間 */
    public static int[] waitingTime;
    /** 先頭で待っているグループ番号 */
    public static int headGroupNo = -1;
    
    static {
        waitingTime = new int[GROUP_NUM];
        Arrays.fill(waitingTime, -1);
    }
    
    /**
     * エントリポイント
     */
    public static void main(String args[]) throws IOException {        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        List<Integer> inputList = new ArrayList<Integer>();
        int maxGroupNum = 0;
        while(true) {
            input = br.readLine();
            if(input == null) break;
            
            int inputInt = Integer.parseInt(input);
            if(maxGroupNum < inputInt) maxGroupNum = inputInt;
            
            inputList.add(Integer.parseInt(input));
        }
        
        calcWaitTime(maxGroupNum);
        
        for (Integer i : inputList) {
            System.out.println(waitingTime[i]);
        }

    }
    
    public static void calcWaitTime(int maxGroupNum) {
        for (int min = 0; ; min++) {

            //食べ終わりの判定
            for (int s = 0; s < SEAT_NUM; s++) {
                if(eatEndTime[s] == min) {
                    seat[s] = -1;
                    eatEndTime[s] = -1;
                }
            }
            
            //客の到着し、誰も待っていなければ先頭のグループNoを更新
            if (min % 5 == 0 && headGroupNo == -1) {
                headGroupNo = min / ARRIVE_INTERVAL;
            }
            
            //席が空いていれば着席させる
            while(headGroupNo != -1) {
                //連続して空いている席を探索
                int blankSeatNum = 0;
                int numInGroup = numInGroupList[headGroupNo % numInGroupList.length];
                int s;
                for (s = 0; s < SEAT_NUM && blankSeatNum < numInGroup; s++) {
                    if (seat[s] == -1) {
                        blankSeatNum++;
                    } else {
                        blankSeatNum = 0;
                    }
                }

                //着席できた場合
                if(blankSeatNum == numInGroup) {
                    for(int ts = s - 1; ts > s - 1 - numInGroup; ts--) {
                        seat[ts] = headGroupNo;
                        eatEndTime[ts] = min + timeToEatList[headGroupNo % timeToEatList.length];
                    }
                    
                    //待った時間を記録
                    waitingTime[headGroupNo] = min - headGroupNo * ARRIVE_INTERVAL;
                    
                    //
                    if (headGroupNo == maxGroupNum) return;
                    if(min >= (headGroupNo + 1) * ARRIVE_INTERVAL) {
                        headGroupNo++;
                    } else {
                        headGroupNo = -1;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
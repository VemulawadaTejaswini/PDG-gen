import java.util.*;
import java.lang.*;

/**
 * Rummy
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        loop: for (int i = 0; i < n; i++) {
            int numList[] = new int[9];
            List<Integer> redList = new ArrayList<Integer>();
            List<Integer> greenList = new ArrayList<Integer>();
            List<Integer> blueList = new ArrayList<Integer>();

            for (int j = 0; j < 9; j++) {
                numList[j] = sc.nextInt();
            }
            for (int j = 0; j < 9; j++) {
                switch (sc.next()) {
                case "R":
                    redList.add(numList[j]);
                case "G":
                    greenList.add(numList[j]);
                case "B":
                    blueList.add(numList[j]);
                }
            }

            Collections.sort(redList);
            Collections.sort(greenList);
            Collections.sort(blueList);

            // まず3の倍数になってない時点でNg
            if (redList.size() % 3 != 0 || blueList.size() % 3 != 0 || greenList.size() % 3 != 0) {
                System.out.println(0);
                continue loop;
            }

            // 各色について全探索して, 連番or同じ数にできるか
            if (Confirm(redList) && Confirm(redList) && Confirm(redList)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    // bit全探索して, 連番or同じ数の組が作れたらtrueを返す
    private static boolean Confirm(List<Integer> list) {
        int len = list.size();

        // 長さ3の時
        if (len / 3 == 1) {
            if (list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
                return true;
            } else if (list.get(0) + 1 == list.get(1) && list.get(1) + 1 == list.get(2)) {
                return true;
            } else {
                return false;
            }
        }

        // 長さ6の時
        if (len / 3 == 2) {
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 5; j++) {
                    for (int k = j + 1; j < 6; k++) {
                        if (list.get(i) == list.get(j) && list.get(j) == list.get(k)) {
                            return true;
                        } else if (list.get(i) + 1 == list.get(j) && list.get(j) + 1 == list.get(k)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }

        // // 長さ9の時
        // int[] bitList = new int[len]; // bitを入れる配列

        // for (int i = 0; i < pow(len / 3, len); i++) { // len=3 : 1, len=6 : 2^6,
        // len=9 : 3^9 かいまわる

        // for (int pos = 1; pos <= k; ++pos) {// 数字1~kが何文字分か仮定する
        // len[pos] = tmp % 3 + 1;// 1 ~ 3文字
        // tmp /= 3;
        // }
        // list[tmp] = true;
        // }

        // return true;
        return false;
    }
}

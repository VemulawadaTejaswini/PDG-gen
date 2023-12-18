import java.util.*;
import java.lang.*;

/**
 * Rummy
 */
public class Main {

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
            if (Confirm(redList) && Confirm(blueList) && Confirm(greenList)) {
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

        boolean finalflg0 = false;
        boolean finalflg1 = false;
        boolean finalflg2 = false;

        // 長さ9の時
        for (int i = 0; i < Math.pow(3, 9); i++) {

            int flg0 = 0;
            int flg1 = 0;
            int flg2 = 0;

            int last0 = 0;
            int last1 = 0;
            int last2 = 0;

            for (int j = 0; j < 9; j++) { // 9文字に対して一つずつ見ていく
                int nannbannme = 0;
                int tmp = i;
                for (int k = 0; k < j; k++) {
                    nannbannme++;
                    tmp /= 3;
                }

                switch (tmp % 3) {
                case 0:
                    if (last0 == list.get(nannbannme)) {
                        if (flg0 == 1) {
                            finalflg0 = true;
                        } else {
                            flg0 = 1;
                        }
                    }

                    if (last0 + 1 == list.get(nannbannme)) {
                        if (flg0 == 2) {
                            finalflg0 = true;
                        } else {
                            flg0 = 2;
                        }
                    }

                    last0 = list.get(nannbannme);
                    break;
                case 1:
                    if (last1 == list.get(nannbannme)) {
                        if (flg1 == 1) {
                            finalflg1 = true;
                        } else {
                            flg1 = 1;
                        }
                    }

                    if (last1 + 1 == list.get(nannbannme)) {
                        if (flg1 == 2) {
                            finalflg1 = true;
                        } else {
                            flg1 = 2;
                        }
                    }

                    last1 = list.get(nannbannme);

                    break;
                case 2:
                    if (last2 == list.get(nannbannme)) {
                        if (flg2 == 1) {
                            finalflg2 = true;
                        } else {
                            flg2 = 1;
                        }
                    }

                    if (last2 + 1 == list.get(nannbannme)) {
                        if (flg2 == 2) {
                            finalflg2 = true;
                        } else {
                            flg2 = 2;
                        }
                    }

                    last2 = list.get(nannbannme);

                    break;
                }
            }

        }

        return (finalflg1 && finalflg2 && finalflg0);
    }
}

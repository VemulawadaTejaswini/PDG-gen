import java.util.*;
import java.lang.*;

/**
 * SevenPuzzle
 */
public class Main {

    public static void main(String[] args) {
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };
        int cost = 1;

        Queue<String> queue = new ArrayDeque<>(); // キュー（状態を入れる）
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); // ハッシュマップ（状態と何回0を動かすかを対応）

        // 幅優先探索
        queue.add("01234567");
        hashmap.put("01234567", 0);

        while (!queue.isEmpty()) {
            int mawarukaisuu = queue.size();
            for (int j = 0; j < mawarukaisuu; j++) {
                String str = queue.poll(); // キュー取り出し
                int zeroX = str.indexOf("0") % 4;
                int zeroY = str.indexOf("0") / 4;

                for (int i = 0; i < 4; i++) {
                    int newX = zeroX + dx[i];
                    int newY = zeroY + dy[i];

                    if (newX < 0 || newX > 3 || newY < 0 || newY > 1) {
                        continue;
                    }

                    String newStr;
                    if (str.indexOf("0") < newX + newY * 4) {
                        newStr = str.substring(0, str.indexOf("0")) + str.charAt(newX + newY * 4)
                                + str.substring(str.indexOf("0") + 1, newX + newY * 4) + "0"
                                + str.substring(newX + newY * 4 + 1);
                    } else {
                        newStr = str.substring(0, newX + newY * 4) + "0"
                                + str.substring(newX + newY * 4 + 1, str.indexOf("0")) + str.charAt(newX + newY * 4)
                                + str.substring(str.indexOf("0") + 1);
                    }

                    if (hashmap.get(newStr) == null) {
                        // ハッシュマップに格納(もともとあったら虫)
                        hashmap.put(newStr, cost);

                        // 動かした後の物をキューに追加
                        queue.add(newStr);
                    }

                }
            }
            cost++;
        }

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = "";

            for (int i = 0; i < 8; i++) {
                str = str + sc.next();
            }

            System.out.println(hashmap.get(str)); // ハッシュマップに変更せよ
        }

        sc.close();
    }
}

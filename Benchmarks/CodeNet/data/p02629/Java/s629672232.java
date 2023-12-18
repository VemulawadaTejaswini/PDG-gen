import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        char[] base26 = Long.toString(n, 26).toCharArray();
        int moveUp = 0;
        Deque<Integer> indexQueue = new ArrayDeque<>();
        for (int i = base26.length - 1; 0 <= i; i--) {
            char c = (char) ((int) base26[i] + moveUp);
            if (c == '0') {
                if (i != 0) {
                    indexQueue.add(26);
                    moveUp = -1;
                }
                continue;
            }
            int minusIndex = String.valueOf(c).matches("[1-9]") ? 48 : 87;
            int index = (int) c - minusIndex;
            indexQueue.add(index);
            moveUp = 0;
        }

        Deque<String> dq = new ArrayDeque<>();
        while (!indexQueue.isEmpty()) {
            int index = indexQueue.pollFirst();
            if (index != 0) {
                String str = String.valueOf((char) ((int) 'a' + index - 1));
                dq.addFirst(str);
            }
        }

        String result = String.join("", dq);

        // 出力
        System.out.println(result);
    }
}

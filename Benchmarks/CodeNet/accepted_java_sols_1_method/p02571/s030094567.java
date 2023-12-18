import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= s.length() - t.length(); i++) {
            int count = 0;
            for (int j = 0; j < t.length(); j++) {
                if (cs[i + j] != ct[j]) {
                    count++;
                }
            }
            pq.add(count);
        }
        int result = pq.peek();

        // 出力
        System.out.println(result);
    }
}

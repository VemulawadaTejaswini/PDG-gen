import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * TITLE : Welcome to AtCoder
 * URL : https://atcoder.jp/contests/abc151/tasks/abc151_c
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Takahasi> map = new HashMap<Integer, Takahasi>();
        for (int i = 0; i < M; i++) {
            int P = sc.nextInt();
            String S = sc.next();

            if (!map.containsKey(P)) {
                Takahasi t = new Takahasi();
                t.count(S);
                map.put(P, t);
            }
            else {
                map.get(P).count(S);
            }
        }

        Answer answer = new Answer();
        for (Takahasi t : map.values()) {
            answer = t.sum(answer);
        }
        answer.print();
        sc.close();
    }

    private static class Takahasi {
        private int penaltyCount;

        private boolean acFlag;

        public void count(String status) {
            if (acFlag)
                return;

            if ("AC".equals(status)) {
                acFlag = true;
            }
            else {
                penaltyCount++;
            }
        }

        public Answer sum(Answer answer) {
            if (acFlag) {
                answer.ac++;
                answer.wa += penaltyCount;
            }
            return answer;
        }
    }

    private static class Answer {
        int ac;

        int wa;

        public void print() {
            System.out.println(ac + " " + wa);
        }
    }
}
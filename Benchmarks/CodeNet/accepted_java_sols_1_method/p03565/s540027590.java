import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        PriorityQueue<String> q = new PriorityQueue<String>();

        for (int i = S.length() - T.length(); i >= 0; i--) {
            String sub = S.substring(i, i + T.length());
            int k;
            int cnt = 0;
            for (k = 0; k < T.length(); k++) {
                if (sub.charAt(k) == '?') {
                    cnt++;
                    continue;
                }
                if (sub.charAt(k) != T.charAt(k))
                    break;
            }
            if (k == T.length()) {
                String ans = S.substring(0, i).replace('?', 'a');
                ans += T;
                ans += S.substring(i + T.length()).replace('?', 'a');;
                q.add(ans);
            }
        }
        if (q.peek() != null) {
            System.out.println(q.peek());
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String S = cin.next();

        String[] words = {"dream", "dreamer", "erase", "eraser"};

        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);

        boolean matched = false;
        while (!q.isEmpty()) {
            int i = q.poll();
            if (i == S.length()) {
                matched = true;
                break;
            }

            for (String word : words) {
                int end = i + word.length();
                if (end > S.length()) {
                    continue;
                }
                if (S.substring(i, end).equals(word)) {
                    q.add(end);
                }
            }
        }

        if (matched) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

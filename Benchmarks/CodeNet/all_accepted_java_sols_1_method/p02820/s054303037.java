import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        String t = sc.next();
        int len = t.length();
        int score = 0;
        char[] pattern = new char[len];
        for (int i = 0; i < len; i++) {
            int val = 0;
            char c =t.charAt(i);
            if (i-k>=0 && pattern[i-k] == c) continue;
            if (c == 'r') {
                val = p;
            } else if (c == 's') {
                val = r;
            } else if (c == 'p') {
                val = s;
            }
            pattern[i] = c;
            score+=val;
        }

        System.out.println(score);
    }
}
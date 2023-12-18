import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> pq = new PriorityQueue<>();
        while (true) {
            String s = sc.next();
            int l = 1 << s.length();
            for (int i = 0; i < l; i++) {
                String t = shift(s, i);
                if (encrypt(t).equals(s)) {
                    pq.add(t);
                }
            }
            int b = pq.size();
            System.out.println(b);
            while (!pq.isEmpty()) {
                String p = pq.poll();
                if (pq.size() < 5 || b - pq.size() <= 5) {
                    System.out.println(p);
                }
            }
            // System.out.println(encrypt(s));
        }
    }

    static String shift(String s, int k) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'z' && ((k >> i) & 1) == 1) {
                t += ((char) (s.charAt(i) + 1)) + "";
            } else {
                t += c + "";
            }
        }
        return t;
    }

    static String encrypt(String s) {
        for (char c = 'b'; c <= 'z'; c++) {
            int i = s.indexOf(c + "");
            if (i == -1) {
                continue;
            }
            s = s.substring(0, i) + ((char) (c - 1)) + s.substring(i + 1);
        }
        return s;
    }
}
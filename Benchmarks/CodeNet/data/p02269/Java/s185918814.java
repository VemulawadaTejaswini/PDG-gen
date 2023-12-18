import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static final int M = 1046527;

    private static final String[] H = new String[M];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            String str = sc.next();

            if ("insert".equals(cmd)) insert(str);
            if ("find".equals(cmd)) pw.println(find(str) ? "yes" : "no");
        }

        pw.flush();
    }

    private static boolean insert(String str) {
        int key = getKey(str);
        for (int i = 0;; i++) {
            int h = h(key, i);
            if (str.equals(H[h])) return true;
            if (H[h] == null) {
                H[h] = str;
                return true;
            }
        }
    }

    private static boolean find(String str) {
        int key = getKey(str);
        for (int i = 0;; i++) {
            int h = h(key, i);
            if (str.equals(H[h])) return true;
            if (H[h] == null) return false;
        }
    }

    private static int getChar(char ch) {
        switch (ch) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
            default: return 0;
        }
    }

    private static int getKey(String str) {
        int sum = 0;
        int p = 1;
        for (int i = 0; i < str.length(); i++) {
            sum += p * getChar(str.charAt(i));
            p *= 5;
        }
        return sum;
    }

    /**
     * ハッシュ関数.
     * @param key キー.
     * @param i 衝突が発生して次のハッシュ値を計算した回数.
     * @return ハッシュ値.
     */
    private static int h(int key, int i) {
        return (h1(key) + i * h2(key)) % M;
    }


    private static int h1(int key) {
        return key % M;
    }

    private static int h2(int key) {
        return 1 + (key % (M - 1));
    }
}




import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        String text = scanner.next();
        String pattern = scanner.next();
        Zalgolithm z = new Zalgolithm();
        List<Integer> ans = z.search(text, pattern);
        PrintWriter pw = new PrintWriter(System.out);
        for (int i: ans) {
            pw.println(i);
        }
        pw.flush();
    }

}

class Zalgolithm {
    static Character DELIMITER = '#';
    public int[] zArr;

    public List<Integer> search(String text, String pattern) {
        String s = pattern + DELIMITER + text;
        calcZarray(s);

        List<Integer> ans = new ArrayList<>();
        int pre = pattern.length() + 1;
        for (int i = 0; i < text.length(); i++) {
            if (zArr[pre + i] == pattern.length()) {
                ans.add(i);
            }
        }
        return ans;
    }

    private void calcZarray(String s) {
        int n = s.length();
        zArr = new int[n];

        // range of z-box
        int l = 0, r = 0;
        for (int i = 1; i < n; ++i) {
            if (i > r) {
                l = r = i;
                while (r < n && s.charAt(r - l) == s.charAt(r)) {
                    r++;
                }
                zArr[i] = r - l;
                r--;
            } else {
                int k = i - l;
                if (zArr[k] < r - i + 1)
                    zArr[i] = zArr[k];
                else {
                    l = i;
                    while (r < n && s.charAt(r - l) == s.charAt(r)) {
                        r++;
                    }
                    zArr[i] = r - l;
                    r--;
                }
            }
        }
    }

}



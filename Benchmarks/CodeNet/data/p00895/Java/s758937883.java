import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        new Main().run();
    }
    final int [] dx = {0, 1, 1,  1,  0, -1, -1, -1};
    final int [] dy = {1, 1, 0, -1, -1, -1,  0,  1};
    HashSet<String> occurOnce;
    //HashSet<Integer> occurOnce;
    String longestString(int y, int x) {
        String longest = "";
        for (int i = 0; i < 8; i++) {
            String cur = String.valueOf(F[y].charAt(x));
            StringBuilder sb = new StringBuilder(cur);
            int ny = (y + dy[i] + H) % H, nx = (x + dx[i] + W) % W;
            while (ny != y || nx != x) {
                //cur = cur + String.valueOf(F[ny].charAt(nx));
                sb.append(String.valueOf(F[ny].charAt(nx)));
                cur = sb.toString();
                int hashCode = cur.hashCode();
                if (occurOnce.contains(cur)) {
                //if (occurOnce.contains(hashCode)) {
                    if (longest.length() < cur.length()) {
                        //debug(cur);
                        longest = cur;
                    } else if (longest.length() == cur.length() && longest.compareTo(cur) > 0) {
                        //debug(cur);
                        longest = cur;
                    }
                } else {
                    if (cur.length() >= longest.length()) occurOnce.add(cur);
                    //occurOnce.add(hashCode);
                }
                ny = (ny + dy[i] + H) % H;
                nx = (nx + dx[i] + W) % W;
            }
        }
        //debug(longest);
        return longest;
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    void run() {
        while (init()) {
            String longest = "";
            occurOnce = new HashSet<String>();
            //occurOnce = new HashSet<Integer>();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    String cur = longestString(i, j);
                    if (longest.length() < cur.length()) {
                        //debug(cur);
                        longest = cur;
                    } else if (longest.length() == cur.length() && longest.compareTo(cur) > 0) {
                        //debug(cur);
                        longest = cur;
                    }
                }
            }
            if (longest.length() < 2) {
                System.out.println(0);
            } else {
                System.out.println(longest);
            }
        }
    }
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    int W, H;
    String [] F;
    boolean init() {
        H = sc.nextInt();
        W = sc.nextInt();
        if (H == 0 && W == 0) return false;
        F = new String[H];
        for (int i = 0; i < H; i++) {
            F[i] = sc.next();
        }
        return true;
    }
}
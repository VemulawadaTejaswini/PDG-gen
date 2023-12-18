import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        new Main().run();
    }
    final int [] dx = {0, 1, 1,  1,  0, -1, -1, -1};
    final int [] dy = {1, 1, 0, -1, -1, -1,  0,  1};
    ArrayList<String> makeString(int y, int x) {
        ArrayList<String> strs = new ArrayList<String>();
        for (int i = 0; i < 8; i++) {
            strs.add(String.valueOf(F[y].charAt(x)));
            int ny = (y + dy[i] + H) % H, nx = (x + dx[i] + W) % W;
            while (ny != y || nx != x) {
                strs.add(strs.get(strs.size()-1) + String.valueOf(F[ny].charAt(nx)));
                ny = (ny + dy[i] + H) % H;
                nx = (nx + dx[i] + W) % W;
            }
        }
        return strs;
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    void run() {
        while (init()) {
            HashMap<String, Integer> occur = new HashMap<String, Integer>(); // 文字列 , 出現回数
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    ArrayList<String> strs = makeString(i, j);
                    //debug(i, j);
                    //debug(strs);
                    for (String str : strs) {
                        if (occur.containsKey(str)) {
                            occur.put(str, occur.get(str) + 1);
                        } else {
                            occur.put(str, 1);
                        }
                    }
                }
            }
            ArrayList<String> list = new ArrayList<String>();
            for (Iterator it = occur.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry e = (Map.Entry)it.next();
                if ((Integer)e.getValue() >= 2 && ((String)e.getKey()).length() >= 2) {
                    list.add((String)e.getKey());
                }
            }
            if (list.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(list, 
                    new Comparator<String>() {
                        @Override public int compare(String a, String b) {
                            if (a.length() == b.length()) {
                                return a.compareTo(b);
                            } else {
                                return b.length() - a.length();
                            }
                        }
                });
                System.out.println(list.get(0));
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
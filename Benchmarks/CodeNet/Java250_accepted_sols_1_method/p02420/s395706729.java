import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int m;
        int h[];
        String ans[] = new String[11];
        int cnt = 0;

        while (true) {
            s = sc.next();
            if (s.equals("-")) {
                for (int i = 0; i < cnt; i++) {
                    System.out.println(ans[i]);
                }
                sc.close();
                return;
            }
            m = sc.nextInt();
            h = new int[m];
            for (int i = 0; i < m; i++) {
                h[i] = sc.nextInt();
            }

            String tmp = s;
            String ttmp = s;

            for (int i = 0; i < m; i++) {
                ttmp = (tmp.substring(h[i]) + tmp.substring(0, h[i]));
                tmp = ttmp;
            }
            ans[cnt] = tmp;
            cnt++;
        }
        // System.out.println("cnt: " + cnt);
        // for (int i = 0; i < cnt; i++) {
        // System.out.println(ans[i]);
        // }
        // sc.close();
    }
}

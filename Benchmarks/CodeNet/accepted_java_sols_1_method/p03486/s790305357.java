import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] sca = s.toCharArray();
        String t = sc.next();
        char[] tca = t.toCharArray();
        Arrays.sort(sca);
        Arrays.sort(tca);
        String ss = new String(sca);
        String tt = new String(tca);
        int tttt = tt.length();
        int cnt = ss.length() < tt.length() ? ss.length() : tt.length();
        int flag = 0;
        for (int i = 0; i < cnt; i++) {
            if (sca[i] < tca[tttt - 1 - i]) {
                flag = 1;
                break;
            } else if (sca[i] > tca[tttt - 1 - i]) {
                flag = -1;
                break;
            }
        }
        if (flag == 0) {
            if (cnt == ss.length() && cnt != tt.length()) {
                flag = 1;
            } else {
                flag = -1;
            }
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
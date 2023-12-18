

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s.substring((s.length() + 1) / 2));
        String r = sb.reverse().toString();
        int cnt = 0;
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) != s.charAt(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
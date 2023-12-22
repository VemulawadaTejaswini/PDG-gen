import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] c = new char[10];
            c = s.toCharArray();
            Arrays.sort(c);
            ary[i] = new String(c);
        }
        Arrays.sort(ary);
        long ans = 0L;
        long cnt = 0L;
        s:for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                if (cnt != 0) {
                    ans += calc(cnt);
                }
            } else {
                if (ary[i].equals(ary[i + 1])) {
                    cnt++;
                } else if (cnt != 0){
                    ans += calc(cnt);
                    cnt = 0;
                }
            }
        }
        System.out.println(ans);
    }

    public static long calc(long l) {
        if (l == 0) {
            return 0;
        } else {
            return l + calc(l - 1);
        }
    }
}
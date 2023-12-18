import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        long r = 0;
        long g = 0;
        long b = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R') r++;
            if (c[i] == 'G') g++;
            if (c[i] == 'B') b++;
        }

        //総数
        long ans = r*g*b;

        //(i,j,k)の中でiの位置を固定する。
        for (int st = 0; st < n - 2; st++) {
            //(i,j,k)の中でjの位置を固定する。つまりkの位置を決まる。
            for (int dist = 1; st + dist * 2 < n; dist++) {
                char i = c[st];
                char j = c[st + dist];
                char k = c[st + dist * 2];
                if (i != j && j != k && i != k) ans--;
            }
        }
        System.out.println(ans);
    }
}

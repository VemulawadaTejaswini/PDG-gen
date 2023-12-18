import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] cnt = new int[n];
        boolean[] red = new boolean[n];
        Arrays.fill(cnt, 1);
        red[0] = true;
        for (int i = 0; i < m; i++) {
            int x = in.nextInt() - 1, y = in.nextInt() - 1;
            if(red[x]) red[y] = true;
            cnt[x]--;
            cnt[y]++;
            if(cnt[x] == 0) red[x] = false;
        }
        int ans = 0;
        for(boolean flag: red) {
            ans += flag ? 1 : 0;
        }
        System.out.println(ans);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt[] = new int[26];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            cnt[str.charAt(i) - 'a']++;
        }
        long ans = len * 1L * (len + 1) / 2;
        for(int i = 0;i < len;i++){
            ans -= cnt[str.charAt(i) - 'a'];
            cnt[str.charAt(i) - 'a']--;
        }
        System.out.print(++ans);
    }
}

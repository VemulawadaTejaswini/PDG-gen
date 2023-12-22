// 問題URL
// https://atcoder.jp/contests/abc147/tasks/abc147_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int count = 0;
        for(int i = s.length(); i > 0; i--) {
            int x = s.length() - i;
            if(s.charAt(x) == s.charAt(i-1)) continue;
            count++;
        }
        System.out.println(count / 2);
    }
}

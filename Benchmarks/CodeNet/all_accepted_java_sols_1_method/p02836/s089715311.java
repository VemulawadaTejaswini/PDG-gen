

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.Integer;

/**
 * Created by Messick on 2019/10/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        String s = in.next();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))cnt++;
        }
        System.out.print(cnt);
    }
}

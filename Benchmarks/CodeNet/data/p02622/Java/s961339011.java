//Created by Aminul on 6/27/2020.

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] != t[i]) cnt++;
        }

        pw.println(cnt);

        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
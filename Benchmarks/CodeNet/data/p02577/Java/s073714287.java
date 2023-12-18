//Created by Aminul on 8/22/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String str = in.next();
        int res = 0;
        for (char c : str.toCharArray()) {
            res = (res * 10 + (c - '0')) % 9;
        }
        pw.println(res == 0 ? "Yes" : "No");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
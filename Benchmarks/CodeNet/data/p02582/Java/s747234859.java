//Created by Aminul on 8/15/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        if (s.contains("RRR")) pw.println(3);
        else if (s.contains("RR")) pw.println(2);
        else if (s.contains("R")) pw.println(1);
        else pw.println(0);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
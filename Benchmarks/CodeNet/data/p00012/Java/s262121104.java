
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        /*/
        String[] in = {"0.0 0.0 2.0 0.0 2.0 2.0 1.5 0.5",
        "0.0 0.0 1.0 4.0 5.0 3.0 -1.0 3.0",
        "0.0 0.0 2.0 3.0 2.0 2.0 1.0 1.3"};
        for (String s : in) {
        f(s);
        }
        //*/
    }

    public static void f(String s) {
        String[] temp = s.split(" ");
        double[] p = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            p[i] = Double.parseDouble(temp[i]);
        }
        double[] a = {p[0], p[1]};
        double[] b = {p[2], p[3]};
        double[] c = {p[4], p[5]};
        double[] t = {p[6], p[7]};
        if (a[0] > b[0] || (a[0] == b[0] && a[1] > b[1])) {
            double[] temp2 = a;
            a = b;
            b = temp2;
        }
        if (a[0] > c[0] || (a[0] == c[0] && a[1] > c[1])) {
            double[] temp2 = a;
            a = c;
            c = temp2;
        }
        if (b[1] > c[1] || (b[1] == c[1] && b[0] > c[0])) {
            double[] temp2 = c;
            c = b;
            b = temp2;
        }

        double d1 = b[0] == a[0] ? 0 : (b[1] - a[1]) / (b[0] - a[0]);
        double k1 = b[0] == a[0] ? t[0] + (t[0] >= a[0] ? 0 : 1) : d1 * -a[0];
        double d2 = c[0] == a[0] ? 0 : (c[1] - a[1]) / (c[0] - a[0]);
        double k2 = c[0] == a[0] ? a[0] : d2 * -a[0];
        double c1 = d1 * t[0] + k1;
        double c2 = d2 * t[0] + k2;
        if (c1 >= t[1] || c2 <= t[1]) {
            System.out.println("NO");
            return;
        }

        if (b[0] > c[0] || (b[0] == c[0] && b[1] > c[1])) {
            double[] temp2 = b;
            b = c;
            c = temp2;
        }
        if (b[1] > a[1] || (b[1] == a[1] && b[0] > a[0])) {
            double[] temp2 = a;
            a = b;
            b = temp2;
        }
        d1 = c[0] == a[0] ? 0 : (c[1] - a[1]) / (c[0] - a[0]);
        k1 = c[0] == a[0] ? t[1] + (t[0] >= a[0] ? 0 : -1) : d1 * -a[0];
        d2 = c[0] == b[0] ? 0 : (c[1] - b[1]) / (c[0] - b[0]);
        k2 = c[0] == b[0] ? b[0] : d2 * -b[0];
        c1 = d1 * t[0] + k1;
        c2 = d2 * t[0] + k2;
        if (c1 >= t[1] || c2 <= t[1]) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
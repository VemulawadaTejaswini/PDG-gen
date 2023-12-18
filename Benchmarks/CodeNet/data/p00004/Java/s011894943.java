
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        /*/
        f("1 2 3 4 5 6");
        f("2 -1 -2 -1 -1 -5");
        f("2 -1 -3 1 -1 -3");
        f("2 -1 -3 -9 9 27");
        //*/
    }

    public static void f(String s) {
        String[] sp = s.split(" ");
        double[] a = {
            Double.parseDouble(sp[0]),
            Double.parseDouble(sp[1]),
            Double.parseDouble(sp[2]),
            Double.parseDouble(sp[3]),
            Double.parseDouble(sp[4]),
            Double.parseDouble(sp[5]),
        };
        double x = (a[2] * a[4] - a[5] * a[1]) / (a[0] * a[4] - a[3] * a[1]);
        x = Double.parseDouble(String.format("%.4f", x)) == 0 ? 0 : x;
        double y = (a[0] * a[5] - a[3] * a[2]) / (a[0] * a[4] - a[3] * a[1]);
        y = Double.parseDouble(String.format("%.4f", y)) == 0 ? 0 : y;
        System.out.printf("%.4f %.4f\n", x, y);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        count = Integer.parseInt(in.readLine());
        while (count-- > 0) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        String[] temp = s.split(" ");
        double[] points = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            points[i] = Double.parseDouble(temp[i]);
        }
        double a = Math.sqrt(Math.pow(Math.abs(points[0] - points[2]), 2) + Math.pow(Math.abs(points[1] - points[3]), 2));
        double b = Math.sqrt(Math.pow(Math.abs(points[2] - points[4]), 2) + Math.pow(Math.abs(points[3] - points[5]), 2));
        double c = Math.sqrt(Math.pow(Math.abs(points[4] - points[0]), 2) + Math.pow(Math.abs(points[5] - points[1]), 2));
        double R = (a * b * c) / Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
        double a1 = 2 * (points[2] - points[0]);
        double b1 = 2 * (points[3] - points[1]);
        double c1 = Math.pow(points[0], 2) - Math.pow(points[2], 2) + Math.pow(points[1], 2) - Math.pow(points[3], 2);
        double a2 = 2 * (points[2] - points[0]);
        double b2 = 2 * (points[5] - points[3]);
        double c2 = Math.pow(points[0], 2) - Math.pow(points[2], 2) + Math.pow(points[3], 2) - Math.pow(points[5], 2);
        double x = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
        System.out.println(String.format("%.3f %.3f %.3f", x, y, R));
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br);
        koch(0, 0, 100, 0, n);
        System.out.format("%.4f %.4f\n", 100f, 0f);

    }

    public static void koch(double x1, double y1, double x2, double y2, int n) {
        if (n <= 0) {
            System.out.printf("%.4f %.4f\n", x1, y1);
        } else {
            double xs = (2 * x1 + x2) / 3;
            double ys = (2 * y1 + y2) / 3;
            double xt = (x1 + 2 * x2) / 3;
            double yt = (y1 + 2 * y2) / 3;
            double l = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) / 3;
            double theta = Math.atan2(y2 - y1, x2 - x1) + Math.PI / 3;
            double xu = xs + l * Math.cos(theta);
            double yu = ys + l * Math.sin(theta);

            koch(x1, y1, xs, ys, n - 1);
            koch(xs, ys, xu, yu, n - 1);
            koch(xu, yu, xt, yt, n - 1);
            koch(xt, yt, x2, y2, n - 1);
        }
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(BufferedReader br) throws IOException {
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip(BufferedReader s) throws IOException {
        return Integer.parseInt(s.readLine());
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
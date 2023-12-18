import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br)+1;
        double root5 = Math.sqrt(5);
        double a = (1 + root5) / 2;
        double b = (1 - root5) / 2;
        double f = 1 / root5 * (Math.pow(a, n) - Math.pow(b, n));
        System.out.println((int) f);
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
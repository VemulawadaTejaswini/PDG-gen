import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] lines = sc.next().split(",");
            double[] l = new double[6];
            for (int i = 0; i < 6; i++) {
                l[i] = Double.parseDouble(lines[i]);
            }
            double x, y, d, e;
            if (l[0] == l[2]) {
                y = l[5];
                x = 2 * l[0] - l[4];
            } else if (l[1] == l[3]) {
                x = l[4];
                y = 2 * l[1] - l[5];
            } else {
                d = (l[3] - l[1]) / (l[2] - l[0]);
                e = l[1] - d * l[0];
                x = (2 * l[5] * d - 2 * d * e + l[4] - d * d * l[4]) / (d * d + 1);
                y = (l[4] - x) / d + l[5];
            }
            System.out.println(x + " " + y);
        }
    }
}

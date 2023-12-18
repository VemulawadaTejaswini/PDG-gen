import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        df.setMinimumFractionDigits(3);
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            double px = .5 * ((x1*x1 + y1*y1) * (y3-y2) + (x2*x2 + y2*y2) * (y1-y3) + (x3*x3 + y3*y3) * (y2-y1)) / (x1 * (y3-y2) + x2 * (y1-y3) + x3 * (y2-y1));

            double py = .5 * ((x1*x1 + y1*y1) * (x3-x2) + (x2*x2 + y2*y2) * (x1-x3) + (x3*x3 + y3*y3) * (x2-x1)) / (y1 * (x3-x2) + y2 * (x1-x3) + y3 * (x2-x1));

            double r = Math.sqrt((x1-px)*(x1-px) + (y1-py)*(y1-py));

            sb.append(df.format(px));
            sb.append(' ');
            sb.append(df.format(py));
            sb.append(' ');
            sb.append(df.format(r));
            sb.append('\n');

        }

        System.out.print(sb);
    }
}
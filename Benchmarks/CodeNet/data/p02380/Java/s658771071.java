import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        double[] list = new double[lines.length];
        int n = lines.length;
        while (n-- > 0) {
            list[n] = Double.parseDouble(lines[n]);
        }
        double a = list[0];
        double b = list[1];
        double radian = Math.PI * list[2] / 180.0;
        double s = a * b * Math.sin(radian) / 2;
        double l = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(radian));
        double h = b * Math.sin(radian);
        System.out.printf("%f\n%f\n%f\n", s, l, h);
    }
}
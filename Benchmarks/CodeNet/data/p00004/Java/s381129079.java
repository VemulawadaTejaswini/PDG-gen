
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float e = sc.nextFloat();
            float c = sc.nextFloat();
            float d = sc.nextFloat();
            float f = sc.nextFloat();
            float[] res = simultaneousEquation(a, b, c, d, e, f);
            System.out.printf("%.3f %.3f\n", res[0], res[1]);
        }
    }

    public static float[] simultaneousEquation(float a, float b, float c, float d, float e, float f) {
        float t = a * d - c * b;
        float x = (d * e - b * f) / t;
        float y = (a * f - c * e) / t;
        return new float[]{ x, y };
    }
}
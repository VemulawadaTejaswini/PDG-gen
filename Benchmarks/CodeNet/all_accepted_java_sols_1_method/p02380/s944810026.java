import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double C = Double.parseDouble(str[2]);
        double S = a * b * 0.5 * Math.sin(Math.PI/180*C);
        double L = a + b + Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI/180*C));
        double h = 2 * S / a;
        System.out.printf("%.8f\n", S);
        System.out.printf("%.8f\n", L);
        System.out.printf("%.8f\n", h);
    }
}
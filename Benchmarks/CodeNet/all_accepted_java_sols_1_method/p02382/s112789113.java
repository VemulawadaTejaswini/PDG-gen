import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(in.readLine());
            double x[] = Arrays.stream(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double y[] = Arrays.stream(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            double abs[] = new double[n];
            for (int i = 0; i < n; i++) {
                abs[i] = Math.abs(x[i] - y[i]);
            }

            double p1 = Arrays.stream(abs).sum();
            double p2 = Math.sqrt(Arrays.stream(abs).map(d -> Math.pow(d, 2)).sum());
            double p3 = Math.pow(Arrays.stream(abs).map(d -> Math.pow(d, 3)).sum(), 1.0 / 3.0);
            double pInf = Arrays.stream(abs).max().getAsDouble();

            System.out.printf("%.6f\n", p1);
            System.out.printf("%.6f\n", p2);
            System.out.printf("%.6f\n", p3);
            System.out.printf("%.6f\n", pInf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


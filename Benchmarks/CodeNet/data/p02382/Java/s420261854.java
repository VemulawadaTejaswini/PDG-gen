import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    public static void p_one(int rep, Double[] a, Double[] b) {
        Double sum = 0.0;
        for (int i = 0; i < rep; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        System.out.printf("%.5f\n", sum);
    }

    public static void p_two(int rep, Double[] a, Double[] b) {
        Double sum = 0.0;
        for (int i = 0; i < rep; i++) {
            sum += Math.pow(Math.abs(a[i] - b[i]), 2);
        }
        System.out.printf("%.5f\n", Math.sqrt(sum));
    }

    public static void p_three(int rep, Double[] a, Double[] b) {
        Double sum = 0.0;
        for (int i = 0; i < rep; i++) {
            sum += Math.pow(Math.abs(a[i] - b[i]), 3);
        }
        System.out.printf("%.5f\n", Math.pow(sum, 1.0 / 3.0));
    }

    public static void p_four(int rep, Double[] a, Double[] b) {
        Double max = 0.0;
        Double tmp;
        for (int i = 0; i < rep; i++) {
            tmp = Math.abs(a[i] - b[i]);
            if (max <= tmp)
                max = tmp;
        }
        System.out.printf("%.5f\n", max);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        Double[] x;
        Double[] y;
        String[] data;
        try {
            n = Integer.parseInt(br.readLine());
            x = new Double[n];
            y = new Double[n];

            data = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                x[i] = Double.parseDouble(data[i]);
            data = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                y[i] = Double.parseDouble(data[i]);

            p_one(n, x, y);
            p_two(n, x, y);
            p_three(n, x, y);
            p_four(n, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

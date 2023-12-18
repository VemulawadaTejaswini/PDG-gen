import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            double[] x = new double[2];
            double[] y = new double[2];
            double[] r = new double[2];

            for (int j = 0; j < 2; j++) {
                x[i] = Double.parseDouble(sc.next());
                y[i] = Double.parseDouble(sc.next());
                r[i] = Double.parseDouble(sc.next());
            }

            double xy = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
            double rs = r[0] + r[1];
            double rd = r[0] - r[1];

            if (xy > rs) {
                System.out.println(0);
            } else if (Math.abs(rd) <= xy && xy <= rs) {
                System.out.println(1);
            } else if (rd > 0) {
                System.out.println(2);
            } else {
                System.out.println(-2);
            }
        }
    }
}
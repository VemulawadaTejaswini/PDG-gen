import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] pointsx = br.readLine().split(" ");
        String[] pointsy = br.readLine().split(" ");
        int i;

        int[] x = new int[n];
        int[] y = new int[n];
        for (i = 0; i < n; i++) {
            x[i] = Integer.parseInt(pointsx[i]);
            y[i] = Integer.parseInt(pointsy[i]);
        }

        for (i = 1; i <= 3; i++) {
            System.out.println(calcDistance(x, y, i));
        }

        double chebyshev = 0;
        double abs;
        for (i = 0; i < n; i++) {
            if (chebyshev < (abs = Math.abs(x[i] - y[i]))) {
                chebyshev = abs;
            }
        }
        System.out.println(chebyshev);

    }

    public static double calcDistance(int[] x, int[] y, int p) {
        double D = 0;
        for (int i = 0; i < x.length; i++) {
            D += Math.pow(Math.abs(x[i] - y[i]), p);
        }
        return Math.pow(D, (double) 1/p);
    }
}
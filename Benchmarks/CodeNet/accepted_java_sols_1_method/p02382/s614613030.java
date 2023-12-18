import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for(int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            y[i] = sc.nextInt();

        double[] mink = new double[3];

        for(int p = 0; p < 3; p++){
            mink[p] = 0.0;
            for(int i = 0; i < n; i++)
                mink[p] += Math.abs(Math.pow(x[i] - y[i], (double)(p + 1)));
                mink[p] = Math.pow(mink[p], 1.0/(double)(p + 1));
        }

        double[] dist = new double[n];
        for(int i = 0; i < n; i++)
            dist[i] = Math.abs(x[i] - y[i]);

        Arrays.sort(dist);

        System.out.printf("%f\n%f\n%f\n%f\n", mink[0], mink[1], mink[2], dist[n - 1]);

        sc.close();
    }
}


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            y[i] = sc.nextInt();
        }

        int[] P = new int[n];

        for (int i=0; i<n; i++) {
            P[i] = Math.abs(x[i] - y[i]);
        }

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double pi = 0;

        for (int i=0; i<n; i++) {
            p1 += P[i];
        }

        for (int i=0; i<n; i++) {
            p2 += Math.pow(P[i], 2);
        }
        p2 = Math.sqrt(p2);

        for (int i=0; i<n; i++) {
            p3 += Math.pow(P[i], 3);
        }
        p3 = Math.pow(p3, 1.0/3);

        for (int i=0; i<n; i++) {
            if (pi < P[i])
                pi = P[i];
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pi);


    }
}

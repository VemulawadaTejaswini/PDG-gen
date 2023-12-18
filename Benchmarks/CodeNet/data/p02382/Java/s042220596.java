import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextDouble();
        }
        System.out.println(distance(a, b, 1));
        System.out.println(distance(a, b, 2));
        System.out.println(distance(a, b, 3));
        System.out.println(distance2(a, b, 1));
    }

    /**
     * [Assume a.length == b.length]
     * [pow >= 1] (?)
     *
     * Manhattan Distance : pow == 1
     * Euclidean Distance : pow == 2
     */
    private static double distance(double[] a, double[] b, double pow) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(Math.abs(a[i] - b[i]), pow);
        }
        return Math.pow(sum, 1 / pow);
    }

    /**
     * [Assume a.length == b.length]
     *
     * Chebyshev distance : pow == 1
     * Hamming Distance : pow == 2
     */
    private static double distance2(double[] a, double[] b, int type) {
        double distance = 0;
        for (int i = 0; i < a.length; i++) {
            if (type == 1) {
                distance = Math.max(distance, Math.abs(a[i] - b[i]));
            } else if (type == 2) {
                distance += a[i] == b[i] ? 1 : 0;
            }
        }
        return distance;
    }
}
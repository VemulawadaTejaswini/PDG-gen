import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int[N];
        double[] temperatures = new double[N];
        double diffMin = 1000000000;
        int index = 0;

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            temperatures[i] = T - H[i] * 0.006;
            double diff = Math.abs(A - temperatures[i]);
            if (diff < diffMin) {
                diffMin = diff;
                index = i;
            }
        }

        System.out.println(index + 1);

    }

}

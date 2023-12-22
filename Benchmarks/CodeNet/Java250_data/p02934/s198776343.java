import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = Double.parseDouble(sc.next());
        }

        double d = 0;
        for (int i = 0; i < N; i++) {
            d += 1d / A[i];
        }
        System.out.println(1d / d);
    }
}

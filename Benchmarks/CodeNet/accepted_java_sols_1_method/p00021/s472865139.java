import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            double[] input = new double[8];
            for (int j = 0; j < 8; j++) input[j] = Double.parseDouble(sc.next());

            double v1x = input[2] - input[0];
            double v1y = input[3] - input[1];
            double v2x = input[6] - input[4];
            double v2y = input[7] - input[5];

            System.out.println((Math.abs((v1x * v2y) - (v1y * v2x)) < 1e-10)? "YES" : "NO");
        }
    }
}
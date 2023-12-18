import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double[] list = new double[6];
            for (int j = 0; j < 6; j++) {
                list[j] = sc.nextDouble();
            }
            double y = (list[0] * list[5] - list[3] * list[2]) / (list[0] * list[4] - list[3] * list[1]);
            double x = (list[2] - list[1] * y) / list[0];
            System.out.printf("%.3f %.3f\n", x, y);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            double[] list = new double[6];
            for (int j = 0; j < 6; j++) {
                list[j] = sc.nextInt();
            }
            double y = (list[0] * list[5] - list[3] * list[2]) / (list[0] * list[4] - list[3] * list[1]);
            double x = (list[2] - list[1] * y) / list[0];
            System.out.printf("%.3f %.3f", x, y);
        }
        sc.close();
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int minValue = Integer.MAX_VALUE;
        // abピザでループ
        for (int i = 0; i <= 100000; i++) {
            // abピザ = C * 2 * i;
            int valueC = C * 2 * i;
            int remainX = Math.max(X - i, 0);
            int valueA = remainX * A;
            int remainY = Math.max(Y - i, 0);
            int valueB = remainY * B;

            minValue = Math.min(minValue, valueA + valueB + valueC);
        }

        System.out.println(minValue);
    }
}
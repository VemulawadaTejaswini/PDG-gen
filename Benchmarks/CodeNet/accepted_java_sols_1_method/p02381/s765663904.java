import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dataCount = sc.nextInt();

        while (dataCount != 0) {
            int[] scores = new int[dataCount];

            int sum = 0;
            double ave = 0, div = 0, var = 0, stdiv = 0;

            for (int i = 0; i < dataCount; i++) {
                scores[i] = sc.nextInt();

                sum += scores[i];
            }
            ave = (double) sum / dataCount;

            for (int i = 0; i < dataCount; i++) {
                div = scores[i] - ave;
                var += div * div;
            }
            var /= dataCount;

            stdiv = Math.sqrt(var);

            System.out.println(stdiv);

            dataCount = sc.nextInt();
        }

        sc.close();
    }
}

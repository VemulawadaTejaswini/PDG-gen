import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int n = sc.nextInt();
                if (n == 0) {
                    break;
                }
                int[] data = new int[n];
                int max = 0;
                int min = 10000;
                for (int i = 0; i < n; i++) {
                    data[i] = sc.nextInt();
                    if (data[i] < min) {
                        min = data[i];
                    }
                    if (data[i] > max) {
                        max = data[i];
                    }
                }
                int ave = 0, sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += data[i];
                }
                sum = sum - max - min;
                ave = sum / (n - 2);
                System.out.println(ave);

            }
        }
    }
}

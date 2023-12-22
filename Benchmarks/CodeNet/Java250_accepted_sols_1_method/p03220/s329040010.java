import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();

        double min = 999999999;
        int point = 0;

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            double temp = t - (h[i] * 0.006);
            double difference = Math.abs(a - temp);
            if (difference < min) {
                min = difference;
                point = i;
            }
        }
        System.out.println(point + 1);
    }
}

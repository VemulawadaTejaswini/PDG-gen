import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

        double distanceSum = 0.0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                distanceSum += Math.sqrt(Math.pow((x[i] - x[j]), 2.0) + Math.pow(y[i] - y[j], 2.0));
                count++;
            }
        }
        double averageDistance = distanceSum / count;
        double ans = averageDistance * (n - 1);
        System.out.println(ans);
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                int distanceX = x[j+1] - x[i];
                int distanceY = y[j+1] - y[i];
                double distance = distanceX * distanceX + distanceY * distanceY;
                sum += Math.sqrt(distance);
            }
        }
        System.out.println(sum * 2 / n);
    }
}
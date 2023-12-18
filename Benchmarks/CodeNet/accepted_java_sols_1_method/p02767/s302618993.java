import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] x = new int[n];
        int sumX = 0;
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            sumX += x[i];
        }
        int avg = Math.round((float) sumX / n);
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.pow(x[i] - avg, 2);
        }
        System.out.println(result);
    }
}
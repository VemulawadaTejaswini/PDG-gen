import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            double avg = 0.0, result = 0.0;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                avg += s[i];
            }
            avg /= n;
            for (int i = 0; i < n; i++) {
                result += (s[i] - avg) * (s[i] - avg);
            }
            result /= n;
            result = Math.sqrt(result);
            System.out.printf("%.8f\n", result);
        }
    }
}

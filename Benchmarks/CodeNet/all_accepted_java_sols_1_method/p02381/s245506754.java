import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while ((n = scanner.nextInt()) != 0) {
            int data[] = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }
    
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += data[i];
            }
            double m = (double)sum / n;
            double a2 = 0;
            for (int i = 0; i < n; i++) {
                double d = data[i] - m;
                a2 += d*d;
            }
            a2 /= n;
            double a = Math.sqrt(a2);
            System.out.println(a);
        }
    }
}

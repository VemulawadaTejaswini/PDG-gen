import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, i, sum = 0;
        double average, a = 0;
        int data[] = new int[1001];

        while((n = scan.nextInt()) != 0) {
            for(i = 0; i < n; i++) {
                data[i] = scan.nextInt();
                sum += data[i];
            }
            data[n] = '\0';
            average = (double)sum / n;
            for(i = 0; i < n; i++) {
                a += Math.pow(data[i] - average, 2);
            }
            System.out.printf("%.8f\n", Math.sqrt(a / n));
            sum = 0;
            a = 0;
        }
    }
}

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while(true){
        int n = stdIn.nextInt();
        if(n==0) break;
        int a[] = new int[n];
        double sum = 0;
        double sum1 = 0;
        double t = 0;

        for (int i = 0; i < n; i++) {
            a[i] = stdIn.nextInt();
            sum += a[i];
        }

        for (int j = 0; j < n; j++) {
            sum1 += (double) (a[j] - sum / n) * (a[j] - sum / n);
        }

        t = Math.sqrt((double) sum1 / n);

        System.out.println(t);
    }
    }
}

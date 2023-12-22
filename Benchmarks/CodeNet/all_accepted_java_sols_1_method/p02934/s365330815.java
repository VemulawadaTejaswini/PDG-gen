import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] aArr = new double[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = (double)sc.nextInt();
        }

        double sum = 0.0d;
        for (int i = 0; i < n; i++) {
            sum += 1.0d/aArr[i];
        }

        System.out.println(1.0d/sum);
    }
}

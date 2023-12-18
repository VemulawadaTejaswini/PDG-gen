import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        double[] p = new double[n];
        for (int i = 0; i < n; i++) p[i] = (sc.nextDouble() + 1.0) / 2.0;

        double[] sumP = new double[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) sumP[i] = p[i];
            else sumP[i] = sumP[i-1] + p[i];
        }

        List<Double> result = new ArrayList<>();
        for (int i = 0; i <= n-k; i++) {
            if (i == 0) result.add(sumP[k-1]);
            else result.add(sumP[i+k-1] - sumP[i-1]);

        }
        System.out.println(result.stream().max(Comparator.naturalOrder()).get());
    }
}
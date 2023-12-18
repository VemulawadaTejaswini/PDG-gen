import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Double> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(sc.nextDouble());
        }

        Collections.sort(values);

        double result = 0;
        for (int i = 0; i < n-1; i++) {
            double c = (values.get(i) + values.get(i+1)) / 2;
            result = c;
            values.set(i+1, c);
        }

        System.out.println(result);

    }
}

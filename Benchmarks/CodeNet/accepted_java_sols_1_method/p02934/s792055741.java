import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(sc.next());
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1 / array[i];
        }
        System.out.println(1.0 / sum);
    }
}

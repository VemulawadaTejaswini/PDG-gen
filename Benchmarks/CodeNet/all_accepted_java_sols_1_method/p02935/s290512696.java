import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(sc.next());
        }
        Arrays.sort(array);
        double ans = 0;
        for (int i = 0; i < n - 1; i++) {
            array[i + 1] = (array[i] + array[i + 1]) / 2;
            ans = array[i + 1];
        }
        System.out.println(ans);
    }
}

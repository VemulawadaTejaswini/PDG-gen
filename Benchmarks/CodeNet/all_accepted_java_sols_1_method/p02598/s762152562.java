import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();

        int min = 0;
        int max = Collections.max(a);
        int middle = (max - min) / 2;
        while ((max - min) > 1) {
            double x = middle;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil(a.get(i) / x) - 1;
            }
            if (sum <= k) {
                max = middle;
            } else {
                min = middle;
            }
            middle = min + (max - min) / 2;
        }
        System.out.println(max);
    }
}

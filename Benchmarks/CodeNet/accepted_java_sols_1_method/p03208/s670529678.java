import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());
        }
        Collections.sort(h);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int hmax = h.get(i + k - 1);
            int hmin = h.get(i);
            if (min > hmax - hmin) {
                min = hmax - hmin;
            }
        }
        System.out.println(min);
    }
}

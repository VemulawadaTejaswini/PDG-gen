import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Integer> aMinusI = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                aMinusI.add(sc.nextInt() - (i + 1));
            }

            Collections.sort(aMinusI);

            int b;
            if (n % 2 == 1) {
                b = aMinusI.get(n / 2);
            } else {
                b = (aMinusI.get(n / 2 - 1) + aMinusI.get(n / 2)) / 2;
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.abs(aMinusI.get(i) - b);
            }
            System.out.println(ans);

        }
    }

}

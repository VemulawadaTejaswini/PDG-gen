import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println(X);
            System.exit(0);
        }

        int[] p;
        p = new int [N];

        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>(p.length);
        for (int i = 0; i < p.length; i++) {
            list.add(p[i]);
        }

        int ans = 0;

        for (int i = 1; i < X+1; i++) {
            for (int j = -1; j < 2; j++) {
                ans  = X + j * i;
                if (Collections.frequency(list,ans) == 0) {
                    System.out.println(ans);
                    System.exit(0);
                }
            }
        }
    }
}

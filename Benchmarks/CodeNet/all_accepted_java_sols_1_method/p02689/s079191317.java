import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt();

        List<Long> H = new ArrayList<Long>();
        for (int i = 0; i < N; i++) {
            H.add(sc.nextLong());
        }

        List<Integer> jud = new ArrayList<Integer>(Collections.nCopies(N, 1));

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (H.get(a - 1) <= H.get(b - 1)) {
                jud.set(a - 1, 0);
            }
            if (H.get(b - 1) <= H.get(a - 1)) {
                jud.set(b - 1, 0);
            }
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (jud.get(i) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
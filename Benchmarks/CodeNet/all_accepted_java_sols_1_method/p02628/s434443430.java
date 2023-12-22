import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();

        final int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        sc.close();

        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (final int t : p)
            list.add(t);

        Collections.sort(list);

        int sum = 0;

        for (int i = 0; i < K; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);

        return;
    }
}
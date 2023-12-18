import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int v = 0;
        int k = 0;

        int cnt = 0;
        int m = 1;

        ArrayList<Integer> G = new ArrayList<Integer>();
        while (true) {
            G.add(m);

            m = 2 * (m + 1) - 1;

            if (m > n) {
                break;
            }
        }
        Collections.reverse(G);

        for (int i = 0; i < G.size(); i++) {
            for (int j = G.get(i); j < n; j++) {
                v = A[j];
                k = j - G.get(i);
                while (k >= 0 && A[k] > v) {
                    A[k + G.get(i)] = A[k];
                    k = k - G.get(i);
                    cnt++;
                }
                A[k + G.get(i)] = v;
            }
        }

        System.out.println(G.size());
        for (int l = 0; l < G.size() - 1; l++) {
            System.out.print(G.get(l));
            System.out.print(" ");
        }
        System.out.println(G.get(G.size() - 1));

        System.out.println(cnt);
        for (int l = 0; l < n; l++) {
            System.out.println(A[l]);
        }

    }
}

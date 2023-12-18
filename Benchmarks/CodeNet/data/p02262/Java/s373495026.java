import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static int cnt;

    static void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j -= g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

    static void shellSort(int[] A, int n) {
        // Make G array
        List<Integer> G = new ArrayList<>();
        int h = 1;
        while (h <= n) {
            G.add(h);
            h = 3 * h + 1;
        }

        Collections.reverse(G);

        System.out.println(G.size());
        System.out.println(G.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        G.forEach(g -> insertionSort(A, n, g));
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cnt = 0;
            int n = Integer.parseInt(in.readLine());
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(in.readLine());
            }

            shellSort(A, n);

            System.out.println(cnt);
            for (int i = 0; i < n; i++) {
                System.out.println(A[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

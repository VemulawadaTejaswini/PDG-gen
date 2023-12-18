import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private Scanner sc;
    long cnt;

    private void solve() {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        cnt = 0;
        shellSort(A, N);

        System.out.println(cnt);

        for (int num : A) {
            System.out.println(num);
        }

    }

    void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

    void shellSort(int[] A, int n) {
        int h = 1;
        List<Integer> G = new ArrayList<Integer>();
        while (true) {
            if (h > n) {
                break;
            }
            G.add(h);
            h = 3 * h + 1;
        }
        System.out.println(G.size());

        // String ans = "";
        // for (int i = G.size() - 1; i >= 0; i--) {
        // ans += G.get(i);
        // ans += " ";
        // }
        // System.out.println(ans.trim());

        StringBuilder sb = new StringBuilder();
        for (int i = G.size() - 1; i >= 0; i--) {
            sb.append(G.get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

        for (int i = G.size() - 1; i >= 0; i--) {
            insertionSort(A, n, G.get(i));
        }
    }
}